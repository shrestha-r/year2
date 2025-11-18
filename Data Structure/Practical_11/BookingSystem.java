package Practical_11;

import Practical_11.DynamicArray;

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
