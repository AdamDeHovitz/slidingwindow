package edu.brown.cs.adehovit.slidingwindow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adamdeho on 5/9/17.
 * This was my first simple implementation. Feel free to ignore but might be useful in discussion
 */
public class SlidingWindowArrayList {
    private  List<Long> eventTimes;
    private long second = 1000;
    private long minute = 60 * second;
    private long hour = 60 * minute;


    public SlidingWindowArrayList() {
        eventTimes = new ArrayList<>();
    }

    public void increment(){
        add(System.currentTimeMillis());
    }

    protected void add(Long a) {
        eventTimes.add(a);
    }

    //returns the number of increment events which have occurred in the last second
    public int numLastSecond(){
        return numSinceTimeFromEnd(second);
    }

    //returns the number of increment events which have occurred in the last second
    public int numLastMinute(){
        return numSinceTimeFromEnd(minute);
    }

    //returns the number of increment events which have occurred in the last second
    public int numLastHour(){
        return numSinceMaxTime(hour);
    }


    //Returns the number of events since the given time.
    //iterates from the back since our uses, second and minutes,
    //will tend to be near the end of a sliding window of that is designed to hold times on the scale of an hour.
    private int numSinceTimeFromEnd(Long time) {
        int i;
        long curTime = System.currentTimeMillis();
        for (i = eventTimes.size() - 1; i >= 0; i--){
            if (curTime - eventTimes.get(i) > time){
                return eventTimes.size() - i - 1;
            }
        }
        return eventTimes.size();
    }

    //Returns the number of events since the given time.
    //This method should be used on our max time, in this case hours, since it is also where we slice our
    //eventTimes ArrayList to
    private int numSinceMaxTime(Long time) {
        int i;
        long curTime = System.currentTimeMillis();
        for (i = 0 ; i < eventTimes.size(); i++){
            if (curTime - eventTimes.get(i) <= time){
                //This step is admittedly expensive. There are better datastructures to use than an arraylist
                eventTimes = new ArrayList<>(eventTimes.subList(i, eventTimes.size()));
                return eventTimes.size();
            }
        }
        return eventTimes.size();
    }

    public int size() {
        return eventTimes.size();
    }


}
