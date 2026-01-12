package Practical_11;

/**
 * Class Concert implements Comparable
 *
 * Stores concert id, artists, and time (ISO-8601 compliant).
 * Provides natural ordering based on concert time.
 *
 * @author Rahul Shrestha
 * @version November 2025
 */

import java.time.LocalDateTime;

public class Concert implements Comparable<Concert> {

    private final String concertId;
    private final String artists;
    private final LocalDateTime time;

    /**
     * Constructs a Concert object.
     * Time is stored internally using LocalDateTime (ISO-8601 compliant).
     */
    public Concert(String id, String artists,
                   int year, int month, int day,
                   int hour, int minute) {

        this.concertId = id;
        this.artists = artists;
        this.time = LocalDateTime.of(year, month, day, hour, minute);
    }

    public String getConcertId() {
        return concertId;
    }

    public String getArtists() {
        return artists;
    }

    public LocalDateTime getTime() {
        return time;
    }

    /**
     * Compares concerts by time to allow total ordering.
     */
    @Override
    public int compareTo(Concert other) {
        if (other == null) {
            throw new NullPointerException();
        }
        return this.time.compareTo(other.time);
    }

    /**
     * Returns a human-friendly representation of the concert.
     * LocalDateTime.toString() outputs ISO-8601 format.
     */
    @Override
    public String toString() {
        return String.format(
                "Concert #%s | %s | %s",
                concertId,
                artists,
                time.toString()
        );
    }
}
