package Practical_11;

import Practical_11.DynamicArray;

public class Concert {
    int id;
    DynamicArray artists = new DynamicArray();
    String time;
    public Concert(){

    }
    public Concert(int id, DynamicArray a, String t){
            this.id = id;
            this.artists = a;
            this.time = t;
    }

    public String toString() {
        String description = " Concert " + String.valueOf(id);
        return description;
    }
}
