package Practical_11;

import Practical_11.Concert;

import java.util.ArrayList;

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
    MyList<Concert> concerts = new MyList<>();
    int current_concert_size = concerts.size();

    public BookingSystem(String venueId, String location){
        this.venueId = venueId;
        this.location = location;
        this.concerts = new MyList<>(7);
    }
    public  void shedule(Concert new_concert){

    }
    Boolean isUnique(Concert new_Concert){
        for(int i =0;i<=concerts.size();i++){
            if((concerts.get(i).compareTo(new_Concert)) == 0){
                System.out.println("Concert Already Exist.");
                System.out.println("AT "+ new_Concert.time);
                return false;
            }
        }
        return true;
    }
    public void cancel(int concertId){
        
    }
    public void getConcert(int index){

    }
    public void total(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
