/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testInsertSingleNode() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(10);

        assertEquals("{10} -> NULL", list.toString());
        assertEquals(1, list.length());
    }


    @Test
    void testInsertAfterSingleNode() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(10);
        list.insertAfter(10, 20);

        assertEquals("{10} -> {20} -> NULL", list.toString());
        assertEquals(2, list.length());
    }

    @Test
    void testInsertBeforeSingleNode() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(10);
        list.insertBefore(10, 5);

        assertEquals("{5} -> {10} -> NULL", list.toString());
        assertEquals(2, list.length());
    }






}