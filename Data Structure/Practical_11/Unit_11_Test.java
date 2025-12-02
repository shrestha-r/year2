package Practical_11;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Practical_11.Concert;

public class Unit_11_Test{
    @Test
    public void testConcert(){
        Concert c1 = new Concert(1,"Band Django",20,23);
        Concert c2 = new Concert(2,"Band Python",20,23);
        assertEquals(c1.compareTo(c2), 0);
    }
}