@Test
public void concertsAreOrderedByTime() {
    Concert a = new Concert("C1", "Band-A", "2025-11-30T19:00:00");
    Concert b = new Concert("C2", "Band-B", "2025-11-29T20:00:00");
    Concert c = new Concert("C3", "Band-C", "2025-11-30T21:00:00");

    assertTrue(b.compareTo(a) < 0);  // b is earlier
    assertTrue(a.compareTo(c) < 0);  // a is earlier than c
    assertEquals(0, a.compareTo(a)); // reflexive
}