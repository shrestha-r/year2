package Practical_11;

import java.lang.reflect.Array;

public class DynamicArray{
    int size = 0;
    int capacity = 5;


    Object[] array;
    

    public DynamicArray(){
        array = new Object[this.capacity];
    }
    public DynamicArray(int cap){
        array = new Object[cap];
    }


    public void add(Object n){
        if(size >= capacity){
            System.out.println("Checked");
            grow();
        }
        array[size] = n;
        size++;
    }
    public void insert(int index, Object toInsert){
        if(index <= size-1 || index >=0){
            Object[] temp_array = new Object[size+1];
            for(int i=0;i<size-1;i++){
                int k = i;
                temp_array[i] = array[k];
                if(index == i){
                   temp_array[i] = toInsert;
                   k--;
                }
                if(i>index ){
                    k = i--;
                }
        
        array= temp_array;
        }
        }
        
        size++;
    } 
    public Object pop(){
        Object poped = array[size-1];
        array[size-1] = null;
        size--;
        return poped;
    }  
    public void delete(int index){
        
    }
    public int search(Object n){
        for(int i =0;i<size;i++){
            if(array[i] == n){
                return i;
            }
        }
        return -1;
    }
    public int length(){
        return this.size;
    }

    public void grow(){
            int new_capacity = capacity +5;
            capacity = new_capacity;
            Object[] new_array = new Object[new_capacity];
            for(int i=0;i<array.length;i++){
                new_array[i] = array[i];
            }
            this.array = new_array;
    }

    public String toString(){
        String str = "";
        for(Object obj: array){
            if (obj != null){
                str +=  obj + ",";
            }
        }
        str = '[' +str+ ']';
        str = str.replaceAll(",]", "]");
        return str;
    }
}