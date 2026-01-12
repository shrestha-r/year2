package Practical_11;

public class BookingSystem {
    private String venueId;
    private String location;
    private Concert[] concerts;
    private int size;

    public BookingSystem(String venueId, String location) {
        this.venueId = venueId;
        this.location = location;
        this.concerts = new Concert[7]; // fixed size array
        this.size = 0; // number of stored concets
    }

    public boolean schedule(Concert newConcert) {

        // O(1): capacity check
        if (size == concerts.length) {
            return false;
        }

        // O(n): duplicate check
        for (int i = 0; i < size; i++) {
            if (concerts[i].getConcertId().equals(newConcert.getConcertId())) {
                return false;
            }
        }

        // O(n): find correct sorted position
        int index = 0;
        while (index < size && concerts[index].compareTo(newConcert) < 0) {
            index++;
        }

        // O(n): shift elements right
        for (int i = size; i > index; i--) {
            concerts[i] = concerts[i - 1];
        }

        // O(1): insert
        concerts[index] = newConcert;
        size++;

        return true;
    }

    public boolean cancel(String concertId) {

        int index = -1;

        // O(n): search
        for (int i = 0; i < size; i++) {
            if (concerts[i].getConcertId().equals(concertId)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        // O(n): shift left
        for (int i = index; i < size - 1; i++) {
            concerts[i] = concerts[i + 1];
        }

        concerts[size - 1] = null;
        size--;

        return true;
    }

    public Concert getConcert(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return concerts[index];
    }

    public int total() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venue: ").append(venueId)
                .append(" | Location: ").append(location).append("\n");

        for (int i = 0; i < size; i++) {
            sb.append(concerts[i]).append("\n");
        }
        return sb.toString();
    }

}
