import java.time.*;
import java.time.format.DateTimeFormatter;

public class temp {
   public static void main(String[] args) {
      int year = 2500;
      int month = 12;
      int day=23;
      int hour = 10;
      int minute = 10;
      DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm dd MM yyy");
      
      LocalDateTime time = LocalDateTime.of(year,month,day,hour,minute);
      System.out.println(df.format(time));

   } 
}
