package Practical_11;

import Practical_11.*;
import static org.junit.Assert.assertFalse;

public class Main {
    public static void main(String[] args) {
 
        Concert c1 = new Concert("C-17","Band Django",2000,11,11,11,00);
        Concert c2 = new Concert("C-17","Band Django",2000,11,11,11,00);

        BookingSystem bs = new BookingSystem("V#123","Thamel");
        System.out.println(bs.shedule(c2));
        System.out.println(bs.shedule(c1));
        System.out.println(bs.total());
    }
}
