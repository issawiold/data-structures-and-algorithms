/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void testAppend() {
        // Create a new linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Append elements to the linked list
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);

        // Verify the contents of the linked list
        assertEquals(10, linkedList.head.data);
        assertEquals(20, linkedList.head.next.data);
        assertEquals(30, linkedList.head.next.next.data);
        assertNull(linkedList.head.next.next.next); // Make sure there are no more elements
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
    @Test
    void testGetValueByReverseIndex(){
        LinkedList<Integer> list = new LinkedList<>();
        //places items at the very end
        list.append(10);
        list.append(20);
        list.append(30);
        //stack items at the beginning
        list.insert(11);
        list.insert(22);
        list.insert(33);
        Integer result=list.getValueByReverseIndex(3);
        Integer result2=list.getValueByReverseIndex(4);
        Integer result3= list.getValueByReverseIndex(7);
        assertEquals(11,result);
        assertEquals(22,result2);
        assertNull(result3);
    }
        @Test
        public void testZipLinkedList() {
            LinkedList<Integer> list1 = new LinkedList<>();
            LinkedList<Integer> list2 = new LinkedList<>();
            list1.insert(30);
            list1.insert(20);
            list1.insert(10);
            list2.insert(3);
            list2.insert(2);
            list2.insert(1);
            LinkedList<Integer> mergedList = LinkedList.zipLists(list1, list2);
            assertEquals("{10} -> {1} -> {20} -> {2} -> {30} -> {3} -> NULL", mergedList.toString());
        }
    }








