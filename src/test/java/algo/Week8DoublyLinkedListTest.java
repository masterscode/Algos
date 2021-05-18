package algo;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Week8DoublyLinkedListTest {
        private List<Integer> getNodeValuesHeadToTail(Week8DoublyLinkedList.DoublyLinkedList linkedList) {
            List<Integer> values = new ArrayList<Integer>();
            Week8DoublyLinkedList.Node node = linkedList.head;
            while (node != null) {
                values.add(node.value);
                node = node.next;
            }
            return values;
        }

        private List<Integer> getNodeValuesTailToHead(Week8DoublyLinkedList.DoublyLinkedList linkedList) {
            List<Integer> values = new ArrayList<Integer>();
            Week8DoublyLinkedList.Node node = linkedList.tail;
            while (node != null) {
                values.add(node.value);
                node = node.prev;
            }
            return values;
        }

        private void bindNodes(Week8DoublyLinkedList.Node nodeOne, Week8DoublyLinkedList.Node nodeTwo) {
            nodeOne.next = nodeTwo;
            nodeTwo.prev = nodeOne;
        }

        private boolean compare(List<Integer> array1, int[] array2) {
            if (array1.size() != array2.length) {
                return false;
            }
            for (int i = 0; i < array1.size(); i++) {
                if (array1.get(i) != array2[i]) {
                    return false;
                }
            }
            return true;
        }

        @Test
        public void SetHead() {
            Week8DoublyLinkedList.DoublyLinkedList linkedList = new Week8DoublyLinkedList().DoublyLinkedList();

            Week8DoublyLinkedList.Node one = new Week8DoublyLinkedList().Node(1);
            Week8DoublyLinkedList.Node two = new Week8DoublyLinkedList().Node(2);
            Week8DoublyLinkedList.Node three = new Week8DoublyLinkedList().Node(3);
            Week8DoublyLinkedList.Node three2 = new Week8DoublyLinkedList().Node(3);
            Week8DoublyLinkedList.Node three3 = new Week8DoublyLinkedList().Node(3);
            Week8DoublyLinkedList.Node four = new Week8DoublyLinkedList().Node(4);
            Week8DoublyLinkedList.Node five = new Week8DoublyLinkedList().Node(5);
            Week8DoublyLinkedList.Node six = new Week8DoublyLinkedList().Node(6);

            bindNodes(one, two);
            bindNodes(two, three);
            bindNodes(three, four);
            bindNodes(four, five);

            linkedList.head = one;
            linkedList.tail = five;

            linkedList.setHead(four);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 3, 5}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 3, 2, 1, 4}));

            linkedList.setHead(two);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 4, 1, 3, 5}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 3, 1, 4, 2}));
        }

        @Test
        public void SetHeadOrTail() {
            Week8DoublyLinkedList.DoublyLinkedList linkedList = new Week8DoublyLinkedList().DoublyLinkedList();

            Week8DoublyLinkedList.Node one = new Week8DoublyLinkedList().Node(1);
            Week8DoublyLinkedList.Node two = new Week8DoublyLinkedList().Node(2);
            Week8DoublyLinkedList.Node three = new Week8DoublyLinkedList().Node(3);
            Week8DoublyLinkedList.Node three2 = new Week8DoublyLinkedList().Node(3);
            Week8DoublyLinkedList.Node three3 = new Week8DoublyLinkedList().Node(3);
            Week8DoublyLinkedList.Node four = new Week8DoublyLinkedList().Node(4);
            Week8DoublyLinkedList.Node five = new Week8DoublyLinkedList().Node(5);
            Week8DoublyLinkedList.Node six = new Week8DoublyLinkedList().Node(6);

            bindNodes(one, two);
            bindNodes(two, three);
            bindNodes(three, four);
            bindNodes(four, five);

            linkedList.head = one;
            linkedList.tail = five;

            linkedList.setTail(four);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 5, 4}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 5, 3, 2, 1}));

            linkedList.setHead(six);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 1, 2, 3, 5, 4}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 5, 3, 2, 1, 6}));

            linkedList.setTail(six);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 5, 4, 6}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 4, 5, 3, 2, 1}));
        }

        @Test
        public void InsertBefore() {
            Week8DoublyLinkedList.DoublyLinkedList linkedList = new Week8DoublyLinkedList().DoublyLinkedList();

            Week8DoublyLinkedList.Node one = new Week8DoublyLinkedList().Node(1);
            Week8DoublyLinkedList.Node two = new Week8DoublyLinkedList().Node(2);
            Week8DoublyLinkedList.Node three = new Week8DoublyLinkedList().Node(3);
            Week8DoublyLinkedList.Node three2 = new Week8DoublyLinkedList().Node(3);
            Week8DoublyLinkedList.Node three3 = new Week8DoublyLinkedList().Node(3);
            Week8DoublyLinkedList.Node four = new Week8DoublyLinkedList().Node(4);
            Week8DoublyLinkedList.Node five = new Week8DoublyLinkedList().Node(5);
            Week8DoublyLinkedList.Node six = new Week8DoublyLinkedList().Node(6);

            bindNodes(one, two);
            bindNodes(two, three);
            bindNodes(three, four);
            bindNodes(four, five);

            linkedList.head = one;
            linkedList.tail = five;

            linkedList.insertBefore(two, three2);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 2, 3, 4, 5}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 2, 3, 1}));

            linkedList.insertBefore(five, six);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 2, 3, 4, 6, 5}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 6, 4, 3, 2, 3, 1}));

            linkedList.insertBefore(one, four);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 3, 2, 3, 6, 5}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 6, 3, 2, 3, 1, 4}));
        }

        @Test
        public void InsertAfter() {
            Week8DoublyLinkedList.DoublyLinkedList linkedList = new Week8DoublyLinkedList.DoublyLinkedList();

            Week8DoublyLinkedList.Node one = new Week8DoublyLinkedList.Node(1);
            Week8DoublyLinkedList.Node two = new Week8DoublyLinkedList.Node(2);
            Week8DoublyLinkedList.Node three = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three2 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three3 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node four = new Week8DoublyLinkedList.Node(4);
            Week8DoublyLinkedList.Node five = new Week8DoublyLinkedList.Node(5);
            Week8DoublyLinkedList.Node six = new Week8DoublyLinkedList.Node(6);

            bindNodes(one, two);
            bindNodes(two, three);
            bindNodes(three, four);
            bindNodes(four, five);

            linkedList.head = one;
            linkedList.tail = five;

            linkedList.insertAfter(two, three2);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 3, 4, 5}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 3, 2, 1}));

            linkedList.insertAfter(two, one);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 1, 3, 3, 4, 5}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 3, 1, 2}));

            linkedList.insertAfter(five, six);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 1, 3, 3, 4, 5, 6}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 5, 4, 3, 3, 1, 2}));
        }

        @Test
        public void InsertAtPosition() {
            Week8DoublyLinkedList.DoublyLinkedList linkedList = new Week8DoublyLinkedList.DoublyLinkedList();

            Week8DoublyLinkedList.Node one = new Week8DoublyLinkedList.Node(1);
            Week8DoublyLinkedList.Node two = new Week8DoublyLinkedList.Node(2);
            Week8DoublyLinkedList.Node three = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three2 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three3 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node four = new Week8DoublyLinkedList.Node(4);
            Week8DoublyLinkedList.Node five = new Week8DoublyLinkedList.Node(5);
            Week8DoublyLinkedList.Node six = new Week8DoublyLinkedList.Node(6);

            bindNodes(one, two);
            bindNodes(two, three);
            bindNodes(three, four);
            bindNodes(four, five);

            linkedList.head = one;
            linkedList.tail = five;

            linkedList.insertAtPosition(1, three2);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 1, 2, 3, 4, 5}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 2, 1, 3}));

            linkedList.insertAtPosition(7, three3);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 1, 2, 3, 4, 5, 3}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 5, 4, 3, 2, 1, 3}));
        }

        @Test
        public void RemoveNodesWithValue() {
            Week8DoublyLinkedList.DoublyLinkedList linkedList = new Week8DoublyLinkedList.DoublyLinkedList();

            Week8DoublyLinkedList.Node one = new Week8DoublyLinkedList.Node(1);
            Week8DoublyLinkedList.Node two = new Week8DoublyLinkedList.Node(2);
            Week8DoublyLinkedList.Node three = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three2 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three3 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node four = new Week8DoublyLinkedList.Node(4);
            Week8DoublyLinkedList.Node five = new Week8DoublyLinkedList.Node(5);
            Week8DoublyLinkedList.Node six = new Week8DoublyLinkedList.Node(6);

            bindNodes(one, two);
            bindNodes(two, three);
            bindNodes(three, four);
            bindNodes(four, five);

            linkedList.head = one;
            linkedList.tail = five;

            linkedList.removeNodesWithValue(5);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 4}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 3, 2, 1}));

            linkedList.removeNodesWithValue(1);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 3, 4}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 3, 2}));

            linkedList.removeNodesWithValue(3);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 4}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 2}));
        }

        @Test
        public void Remove() {
            Week8DoublyLinkedList.DoublyLinkedList linkedList = new Week8DoublyLinkedList.DoublyLinkedList();

            Week8DoublyLinkedList.Node one = new Week8DoublyLinkedList.Node(1);
            Week8DoublyLinkedList.Node two = new Week8DoublyLinkedList.Node(2);
            Week8DoublyLinkedList.Node three = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three2 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three3 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node four = new Week8DoublyLinkedList.Node(4);
            Week8DoublyLinkedList.Node five = new Week8DoublyLinkedList.Node(5);
            Week8DoublyLinkedList.Node six = new Week8DoublyLinkedList.Node(6);

            bindNodes(one, two);
            bindNodes(two, three);
            bindNodes(three, four);
            bindNodes(four, five);

            linkedList.head = one;
            linkedList.tail = five;

            linkedList.remove(two);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 4, 5}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 1}));

            linkedList.remove(one);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 4, 5}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3}));

            linkedList.remove(five);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 4}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 3}));
        }

        @Test
        public void ContainsNodeWithValue() {
            Week8DoublyLinkedList.DoublyLinkedList linkedList = new Week8DoublyLinkedList.DoublyLinkedList();

            Week8DoublyLinkedList.Node one = new Week8DoublyLinkedList.Node(1);
            Week8DoublyLinkedList.Node two = new Week8DoublyLinkedList.Node(2);
            Week8DoublyLinkedList.Node three = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three2 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three3 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node four = new Week8DoublyLinkedList.Node(4);
            Week8DoublyLinkedList.Node five = new Week8DoublyLinkedList.Node(5);
            Week8DoublyLinkedList.Node six = new Week8DoublyLinkedList.Node(6);

            bindNodes(one, two);
            bindNodes(two, three);
            bindNodes(three, four);
            bindNodes(four, five);

            linkedList.head = one;
            linkedList.tail = five;

            assertTrue(linkedList.containsNodeWithValue(4));
            assertFalse(linkedList.containsNodeWithValue(6));
            assertTrue(linkedList.containsNodeWithValue(3));
        }

        @Test
        public void Suite() {
            Week8DoublyLinkedList.DoublyLinkedList linkedList = new Week8DoublyLinkedList.DoublyLinkedList();

            Week8DoublyLinkedList.Node one = new Week8DoublyLinkedList.Node(1);
            Week8DoublyLinkedList.Node two = new Week8DoublyLinkedList.Node(2);
            Week8DoublyLinkedList.Node three = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three2 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node three3 = new Week8DoublyLinkedList.Node(3);
            Week8DoublyLinkedList.Node four = new Week8DoublyLinkedList.Node(4);
            Week8DoublyLinkedList.Node five = new Week8DoublyLinkedList.Node(5);
            Week8DoublyLinkedList.Node six = new Week8DoublyLinkedList.Node(6);

            bindNodes(one, two);
            bindNodes(two, three);
            bindNodes(three, four);
            bindNodes(four, five);

            linkedList.head = one;
            linkedList.tail = five;

            linkedList.setHead(four);
            linkedList.setTail(six);
            linkedList.insertBefore(six, three);
            linkedList.insertAfter(six, three2);
            linkedList.insertAtPosition(1, three3);
            linkedList.removeNodesWithValue(3);
            linkedList.remove(two);

            assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 5, 6}));
            assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 5, 1, 4}));

            assertTrue(linkedList.containsNodeWithValue(5));
        }
    }


}