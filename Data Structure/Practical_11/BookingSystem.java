package Practical_11;

import Practical_11.DynamicArray;


/*
 *     
    • Class BookingSystem:
        ◦ Stores venue id, location, a concert list (an array of scheduled concerts with default capacity for 7 concerts), and the current size of the concert list
        ◦ Allows unique concerts to be scheduled (while maintaining the concert list in ascending order based on concert time)
        ◦ Allows concerts to be cancelled (the concert list must not have gaps that “break” the sequence of scheduled concerts)
        ◦ Allows indexed access to concert list
        ◦ Creates a human friendly representation of the class (i.e. toString(), improve print outs by ignoring empty elements within the concert list)
        ◦ Within comments, calculate the Time Complexity Functions of your implementation and highlight parts leading to sub-optimal complexity
 */

public class BookingSystem {
    public static void main(String[] args) {
        DynamicArray a = new DynamicArray();
        a.add("Naresh");
        a.add("Chaudhary");
        a.add("Kumar");

        Concert c = new Concert(100,a,"15:00");
        System.out.println(c);
    }
}
