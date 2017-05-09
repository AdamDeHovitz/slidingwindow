package edu.brown.cs.adehovit.slidingwindow;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by adamdeho on 5/9/17.
 * Sliding Window implementation using a doubly linked list
 */
public class SlidingWindow {
    private  List<Long> eventTimes;
    private long second = 1000;
    private long minute = 60 * second;
    private long hour = 60 * minute;

    public SlidingWindow() {
        eventTimes = new LinkedList<>();
    }

    //records that an event occurred at the current time and returns nothing.
    public void increment(){
        add(System.currentTimeMillis());
    }

    //Adds a time. Very useful for testing
    protected void add(Long a) {
        eventTimes.add(a);
    }

    //returns the number of increment events which have occurred in the last second
    public int numLastSecond(){
        long curTime = System.currentTimeMillis();
        return numSinceTimeFromEnd(second, curTime);
    }

    //returns the number of increment events which have occurred in the last second
    public int numLastMinute(){
        long curTime = System.currentTimeMillis();
        return numSinceTimeFromEnd(minute, curTime);
    }

    //returns the number of increment events which have occurred in the last second
    public int numLastHour(){
        long curTime = System.currentTimeMillis();
        return numSinceMaxTime(hour, curTime);
    }

    /**
    * Returns the number of events since the given time (in milliseconds).
    * iterates from the back since our use cases, second and minutes,
    * will tend to be near the end of a sliding window that is designed to hold times on the scale of an hour.
     */
    protected int numSinceTimeFromEnd(long time, long curTime) {
        int i = 0;
        Iterator<Long> iterator = ((LinkedList<Long>) eventTimes).descendingIterator();
        while (iterator.hasNext()) {
            if (curTime - iterator.next() > time){
                return i;
            }
            i++;
        }
        return i;
    }

    /**
     * Returns the number of events since the given time (in milliseconds).
     * This method should be used on our max time, in this case hours, since it is also where we slice our
     * eventTimes ArrayList to.
     * This one iterates from the start since if numLastHour is regularly called than our slice point should be near
     * the front.
     */
    protected int numSinceMaxTime(long time, long curTime) {

        while (eventTimes.size() > 0) {
            if (curTime - ((LinkedList<Long>) eventTimes).peekFirst() <= time){
                return eventTimes.size();
            }
            ((LinkedList<Long>) eventTimes).removeFirst();

        }
        return 0;
    }

    //gets the size of our list representation, primarily for testing since the size isn't a proxy for numlasthours
    //unless it was just called
    protected int size() {
        return eventTimes.size();
    }


}
