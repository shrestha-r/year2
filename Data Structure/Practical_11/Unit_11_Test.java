package Practical_11;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import Practical_11.Concert;
import Practical_11.BookingSystem;
import DataStructues.MyList;

public class Unit_11_Test{
    @Test
    public void testConcert(){
        Concert c1 = new Concert("C-17","Band Django",2000,11,11,11,00);
        Concert c2 = new Concert("C-17","Band Django",2000,11,11,12,00);
        assertEquals(c1.compareTo(c2), -1);
    }
    @Test
    public void testBooking(){
        // Concert c1 = new Concert("C-17","Band Django",2000,11,11,11,00);
        Concert c2 = new Concert("C-17","Band Django",2000,11,11,11,00);

        BookingSystem bs = new BookingSystem("V#123","Thamel");
        assertFalse(bs.shedule(c2));
        // assertFalse(bs.shedule(c1));

        
    }
}