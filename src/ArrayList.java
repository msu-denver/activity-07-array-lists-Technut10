/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Activity 07 - ArrayList
 */

import java.util.Collections;

public class ArrayList<E> {

    // internal array to hold the elements
    private E data[];


    // case 1 : you want to declare 3 static arrays of int
    // int [] x, y, z;

    // case 2: you want to declare 1 static array of in and 2 int variables.
    int x[], y, z;

    // variable to control how many elements are in the array list
    private int size;

    private static final int INITIAL_CAPACITY = 10;
    private static final int MIN_CAPACITY     = 2;

    // enables the creation of an array list with INITIAL_CAPACITY and size zero
    public ArrayList() {
        size = 0;
        // This is a work-around to instantiate the E target type.
        data = (E[]) new Object[INITIAL_CAPACITY];
    }

    // enables the creation of an array list with given capacity and size zero
    public ArrayList(int capacity) {
        size = 0;
        if (capacity < MIN_CAPACITY)
            data = (E[]) new Object[INITIAL_CAPACITY];
        else
            data = (E[]) new Object[capacity];
    }

    // TODO: return true/false depending whether the list is empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    // TODO: return true/false depending whether the list is at capacity or not
    public boolean isFull() {
        return size == data.length;
    }

    // TODO: add a new element (with the value) at the end of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before appending
    public void append(E value) {
         if(isFull()){
             E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
             // copy from old array to the new array.
             for (int i = 0; i < size; i++){
                 newData[i] = data[i];
                 data = newData; // updating the reference.
             }
         }
         // This will increase size and append the new value to this increment.
         data[size++] = value;

    }

    // TODO: add a new element (with the value) in front of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before adding
    public void add(E value) {
        if(isFull()){
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
            // let's be smart and do the shift as we copy the elements to the new array.
            for(int i = 0; i < size; i++){
                newData[i+1] = data[i];
                data = newData; // updating the reference
            }
        }else {
            // shift all elements one position to the right!
            for(int i = size; i > 0; i--){
                data[i] = data[i-1];
            }
        }
        data[0] = value;
        size++;
    }

    // TODO: return a string representation of the array list
    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < size; i++){
            s += data[i] + "\n";
        }
        return s;
    }

    // TODO: return the number of elements
    public int size() {
        return size;
    }

    // TODO: return the element located at the given index
    public E get(int index) {
        return data[index];
    }

    // TODO: set value to location at index
    public void set(int index, E value) {
            data[index] = value;
    }

    // TODO: insert value at the given index location
    // throw an exception if index is invalid
    public void insert(int index, E value) {
        if(isFull()){
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
            // let's be smart and do the shift as we copy the elements to the new array.

            /*
            * insert 5 at index is 2
            * [4, 7, 3, 9, 1, ...]
            *  0  1  2  3  4
            *
            */
            // just copy when i < index
            for(int i = 0; i < index; i++){
                newData[i] = data[i];
            }
            // copy and shift for i >= index
            for(int i = 0; i < size; i++){
                newData[i+1] = data[i];
                data = newData; // updating the reference
            }
        }else {
            // shift all elements one position to the right!
            for(int i = size; i > index; i--){
                data[i] = data[i-1];
            }
        }
        data[0] = value;
        size++;
    }

    // TODO: removes the element at the given index location
    // throw an exception if index is invalid
    public void remove(int index) {

    }
}
/*
public void add(E value) {
    if (isFull()) {
        E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
        // let's be smart and do the shift as we copy the elements to the new array!
        for (int i = 0; i < size; i++)
            newData[i+1] = data[i];
        data = newData; // updating the reference
    }
    else {
        // shift all elements one position to the right!
        for (int i = size; i > 0; i--)
            data[i] = data[i-1];
    }
    data[0] = value;
    size++;
}*/
