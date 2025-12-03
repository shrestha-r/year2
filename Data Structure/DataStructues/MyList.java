package DataStructues;

import java.lang.StringBuilder;
import java.util.Iterator;

public class MyList<E> {//implements Iterable{
    private int capacity = 10; // actual size of list, keeping size 10 by default
    private int size = 0; // number of element in the list, initial having 0 element
    private E[] list; // list of element of generic data type

    @SuppressWarnings("unchecked") // silencing the cast warnings
    public MyList() {
        this.list = (E[]) new Object[capacity]; // Type casting Array of Object into E(generic ) as we can not initiate
                                                // array of E directly
    }

    @SuppressWarnings("unchecked")
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

    public void add(E value, int index) {
        if (index < 0 || index > size) // WE can't' use checkIndex because we can use index to be equal to size in this
                                       // case, but not there
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        if (size == capacity)
            grow();
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = value;
        size++;
    }

    public E pop() {
        E poped = list[size - 1];
        list[size - 1] = null;
        size--;
        return poped;
    }

    public E remove(int index) {
        E removed = list[index];
        if (!isEmpty()) {
            list[index] = null;
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            list[size - 1] = null;
            size--;
        }
        return removed;
    }

    public int search(E n) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(n)) {
                return i;
            }
        }
        return -1;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public E get(int index) {
        checkIndex(index);
        return list[index];
    }

    public E set(E value, int index) {
        checkIndex(index);
        E oldValue = list[index];
        list[index] = value;
        return oldValue;
    }

    private void grow() { // to expand capacity of list
        capacity = capacity * 2; // double the size of list, it is full
        E[] temp = (E[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    @Override
    public String toString() {
        if ( size ==0) return "[]";
        StringBuilder stringList = new StringBuilder("[");
        for(int i = 0;i<size;i++){
            stringList.append(list[i]);
            if (i<size-1) stringList.append(",");
        }
        stringList.append("]");
        return stringList.toString();
    }


    // @Override
    // public Iterator iterator() {
    //     // TODO Auto-generated method stub
    //     return ;
    // }

}
