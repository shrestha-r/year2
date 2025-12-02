package Practical_11;

import DataStructues.DynamicArray;
public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(5);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);
        System.out.println(array.length());
        System.out.println(array);
        array.pop();
 
        
        // array.insert(3, 5);
        // System.out.println(array);
    }
}
