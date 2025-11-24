package Practical_11;

/**
 * Concert class which use DynamicArray(ArrayList)
 *
 * @author Rahul Shrestha
 * @version November 2025
 */

import Practical_11.DynamicArray;



/*
 * • Class Concert:
        ◦ Stores concert id, artists and time (following ISO 8601)
        ◦ Creates a human friendly representation of the class (i.e. toString())
        ◦ Allows a total ordering of concerts (i.e. concerts are Comparable based on concert time)
 */

public class Concert {
    int concertId;
    DynamicArray artists = new DynamicArray(); 
    String time;
    public Concert(){

    }
    public Concert(int id, DynamicArray a, String t){
            this.concertId= id;
            this.artists = a;

    }

    public String toString() {
        String description = " Concert " + String.valueOf(concertId);
        return description;
    }
}
