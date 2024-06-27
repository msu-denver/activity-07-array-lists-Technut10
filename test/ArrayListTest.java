/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Activity 07 - ArrayListTest
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    // TODO: create a test case named testStringList to test all the methods in ArrayList using string as the data type
    @Test
    void testStringList() {
        ArrayList<String> list = new ArrayList<>();
        list.isEmpty();
        assertTrue(list.isEmpty());
        list.add("A ");
        list.add("B");
        assertEquals("[A, B]", list.toString());

    }

}