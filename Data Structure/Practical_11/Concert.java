package Practical_11;

/**
 * Class Concert implements Comparable 
 *
 * @author Rahul Shrestha
 * @version November 2025
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Concert implements Comparable<Concert>{
    private final String concertId;
    private final String artists;
    private final LocalDateTime time;

      private final static DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm dd MM yyyy");

    // Constructor 
    public Concert(String id, String artists, int year, int month, int day, int hour, int minute){
            this.concertId= id;
            this.artists = artists;
            this.time =  LocalDateTime.of(year,month,day,hour,minute);
    }
    public String getConcertId() { return concertId; }
    public String getArtists() { return artists; }
    public LocalDateTime getTime() { return time; }



    @Override
    public int compareTo(Concert other) {
        if(other == null) throw new NullPointerException();
        return this.time.compareTo(other.time);
    }

    public String toString() {
        return String.format("Concert #%s | %s | %s",concertId, artists, time.format(df));    
    }
}
