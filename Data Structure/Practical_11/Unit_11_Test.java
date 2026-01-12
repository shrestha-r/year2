package Practical_11;

import org.junit.Test;
import static org.junit.Assert.*;

public class Unit_11_Test {
    @Test
    public void testConcertCreation() {
        Concert c = new Concert("C1", "Coldplay", 2026, 3, 21, 19, 30);
        assertEquals("C1", c.getConcertId());
        assertEquals("Coldplay", c.getArtists());
    }

    @Test
    public void testConcertComparison() {
        Concert early = new Concert("C1", "Artist A", 2026, 3, 20, 18, 0);
        Concert late = new Concert("C2", "Artist B", 2026, 3, 21, 18, 0);

        assertTrue(early.compareTo(late) < 0);
        assertTrue(late.compareTo(early) > 0);
    }

    @Test
    public void testScheduleSingleConcert() {
        BookingSystem bs = new BookingSystem("V1", "London");

        Concert c = new Concert("C1", "Coldplay", 2026, 3, 21, 19, 30);
        assertTrue(bs.schedule(c));
        assertEquals(1, bs.total());
    }

    @Test
    public void testSortedScheduling() {
        BookingSystem bs = new BookingSystem("V1", "London");

        Concert late = new Concert("C2", "Artist B", 2026, 3, 22, 20, 0);
        Concert early = new Concert("C1", "Artist A", 2026, 3, 21, 18, 0);

        bs.schedule(late);
        bs.schedule(early);

        assertEquals("C1", bs.getConcert(0).getConcertId());
        assertEquals("C2", bs.getConcert(1).getConcertId());
    }

    @Test
    public void testDuplicateConcertNotScheduled() {
        BookingSystem bs = new BookingSystem("V1", "London");

        Concert c1 = new Concert("C1", "Coldplay", 2026, 3, 21, 19, 30);
        Concert c2 = new Concert("C1", "Coldplay", 2026, 3, 22, 20, 0);

        assertTrue(bs.schedule(c1));
        assertFalse(bs.schedule(c2));
        assertEquals(1, bs.total());
    }

    @Test
    public void testCancelConcert() {
        BookingSystem bs = new BookingSystem("V1", "London");

        Concert c1 = new Concert("C1", "A", 2026, 3, 21, 18, 0);
        Concert c2 = new Concert("C2", "B", 2026, 3, 22, 18, 0);
        Concert c3 = new Concert("C3", "C", 2026, 3, 23, 18, 0);

        bs.schedule(c1);
        bs.schedule(c2);
        bs.schedule(c3);

        assertTrue(bs.cancel("C2"));
        assertEquals(2, bs.total());

        // Ensure no gap
        assertEquals("C3", bs.getConcert(1).getConcertId());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInvalidIndexAccess() {
        BookingSystem bs = new BookingSystem("V1", "London");
        bs.getConcert(0);
    }

}