package edu.brown.cs.adehovit.slidingwindow;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * slidingwindow tests
 */
public class WindowTest {


  @Test
  public void simpleTest() {
    SlidingWindow a = new SlidingWindow();
    for (int i = 0; i < 10; i++){
      a.increment();
    }
    assertEquals(a.numLastSecond(), 10);
    assertEquals(a.numLastMinute(), 10);
    assertEquals(a.numLastHour(), 10);
    assertEquals(a.numSinceTimeFromEnd(-1, System.currentTimeMillis()), 0);
  }
  @Test
  public void specificTest() {
    long curTime = System.currentTimeMillis();
    SlidingWindow a = new SlidingWindow();
    a.add(curTime - (60*60*1000 + 10));
    a.add(curTime - (60*1000 + 10));
    a.add(curTime - (1000 + 10));
    a.add(curTime - (10));
    assertEquals(a.numLastSecond(), 1);
    assertEquals(a.numLastMinute(), 2);
    assertEquals(a.numLastHour(), 3);
    assertEquals(a.size(), 3);

  }
  @Test
  public void manualTest() {
    SlidingWindow a = new SlidingWindow();
    for (long i = 0; i < 100; i++){
      a.add(i);
    }
    assertEquals(a.numSinceTimeFromEnd(100, 100), 100);
    assertEquals(a.numSinceTimeFromEnd(99, 100), 99);
    assertEquals(a.numSinceTimeFromEnd(50, 100), 50);
    assertEquals(a.numSinceTimeFromEnd(1, 100), 1);
    assertEquals(a.numSinceTimeFromEnd(0, 100), 0);
    assertEquals(a.numSinceTimeFromEnd(-2, 100), 0);
    assertEquals(a.numSinceMaxTime(50, 100), 50);
    assertEquals(a.size(), 50);
    assertEquals(a.numSinceTimeFromEnd(100, 100), 50);
    assertEquals(a.numSinceTimeFromEnd(1, 100), 1);
    assertEquals(a.numSinceTimeFromEnd(0, 100), 0);
    assertEquals(a.numSinceTimeFromEnd(-2, 100), 0);
    assertEquals(a.numSinceMaxTime(0, 100), 0);
    assertEquals(a.size(), 0);

  }

}
