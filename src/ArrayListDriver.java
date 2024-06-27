/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Activity 07 - ArrayListDriver
 */

import java.util.Random;

public class ArrayListDriver {

    public static void main(String[] args) {

        // TODO: create an array list of strings and add "Joe", "Mary", and "Anna"; then print the list
        ArrayList<String>  list = new ArrayList<>();
        list.add("Joe");
        list.add("Mary");
        list.add("Anna");
        System.out.println(list);
        list.insert(1, "Bob");
        System.out.println(list);
        // TODO: create an array list of integers; then add 15 random elements; print the list
        ArrayList<Integer> list2 = new ArrayList<>();

        Random random = new Random();
//        // TODOd: insert value at the given index location
//// throw an exception if index is invalid
//        public void insert(int index, E value) {
//            if (index < 0 || index >= size)
//                throw new ArrayIndexOutOfBoundsException();
//            if (isFull()) {
//                E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
//                // let's be smart and do the shift as we copy the elements to the new array!
//        /*
//        insert 5 at index is 2
//        [ 4, 7, 3, 9, 1, ... ]
//          0  1  2  3  4
//        [ 4, 7, 5, 3, 9, 1, ... ]
//         */
//                // just copy when i < index
//                for (int i = 0; i < index; i++)
//                    newData[i] = data[i];
//                // copy and shift for i >= index
//                for (int i = index; i < size; i++)
//                    newData[i+1] = data[i];
//                data = newData; // updating the reference
//            }
//            else {
//                // shift all elements one position to the right!
//                for (int i = size; i > index; i--)
//                    data[i] = data[i-1];
//            }
//            data[index] = value;
//            size++;
//        }
//
//        // how many total numbers can be chosen.
////        for (int i = 0; i < 10; i++) {
////
////            // gives the range of the numbers to choose from
////            list2.add(random.nextInt(100));
////            // This shows the list at each iteration, as it grows.
////            System.out.println(list2);
////        }
    }
}
