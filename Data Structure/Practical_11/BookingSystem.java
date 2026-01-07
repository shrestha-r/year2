package Practical_11;

import Practical_11.Concert;
import DataStructues.MyList;
/*
 *     
    • Class BookingSystem:
        ◦ Stores venue id, location, a concert list (an array of scheduled concerts with default capacity for 7 concerts), and the current size of the concert list
        ◦ Allows unique concerts to be scheduled (while maintaining the concert list in ascending order based on concert time)
        ◦ Allows concerts to be cancelled (the concert list must not have gaps that “break” the sequence of scheduled concerts)
        ◦ Allows indexed access to concert list
        ◦ Creates a human friendly representation of the class (i.e. toString(), improve print outs by ignoring empty elements within the concert list)
        ◦ Within comments, calculate the Time Complexity Functions of your implementation and highlight parts leading to sub-optimal complexity
 */

public class BookingSystem {
    private String venueId;
    private String location;
    // MyList<Concert> concerts ;

    Concert[] concerts[];
    
    public BookingSystem(String venueId, String location){
        this.venueId = venueId;
        this.location = location;
        this.concerts = new Concert[7];
    }
    public  Boolean shedule(Concert new_concert){
        for(int i =0;i<=concerts.size();i++){
            if(concerts.get(i).getConcertId().equals(new_concert.getConcertId())){
                return false;
            }
        }
        if (concerts.size() ==0) concerts.append(new_concert);
        MyList<Concert> temp = new MyList<>(concerts.size()+1);
        for(int i =0;i<=concerts.size();i++){
            if(concerts.get(i).compareTo(new_concert)<0){
                temp.append(new_concert);
            }
            temp.append(concerts.get(i));
        }
        concerts = temp;
        return true;
    }
    public void cancel(int concertId){
            concerts.remove(concertId);
    }
    public Concert getConcert(int index){
        return concerts.get(index);
    }
    public int total(){
        return concerts.size();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
