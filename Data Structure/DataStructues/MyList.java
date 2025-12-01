package DataStructues;

public class MyList<E> {
    private int capacity = 10; // actual size of list, keeping size 10 by default
    private int size = 0; // number of element in the list, initial having 0 element
    private E[] list; // list of element of generic data type

    public MyList() {
        this.list = (E[]) new Object[capacity]; // Type casting Array of Object into E(generic ) as we can not initiate
                                                // array of E directly
    }

    public MyList(int newCapacity) { // if user speficify default capacity of the list
        this.list = (E[]) new Object[newCapacity]; 
    }

    public int size() { 
        return this.size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public void append(E element) { // adding element at the end of list
        if (size >= capacity) {
            grow();
        }
        list[size] = element;
        size++;
    }

        public E pop(){
        E poped = list[size-1];
        list[size-1] = null;
        size--;
        return poped;
    } 
        public int search(E n){
        for(int i =0;i<size;i++){
            if(list[i] == n){
                return i;
            }
        }
        return -1;
    }

    private void grow() { // to expand capacity of list
        capacity = capacity * 2; // double the size of list, it is full
        E[] temp = (E[]) new Object[capacity];
        int i = 0;
        for(E l: list){
            temp[i] = l;
            i++;
        }
        list = temp;
    }

    public E get(int i) {
        if(i<0 && i>=size){
            System.out.println("Index Out of range.");
        }
        return list[i];
    }

    @Override
    public String toString() {
        String stringList = "";
        if (size != 0) {
            for (E l : list) {
                if (l != null) {
                    stringList += (String) l + " ";
                }
            }
        } else {
            return "Empty String";
        }
        return stringList;
    }

}
