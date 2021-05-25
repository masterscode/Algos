package algo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Week9ReversedLinkedListTest {
    
    @Test
    public void TestCase1() {
        Week9ReversedLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5});
        List<Integer> result = toArrayList(Week9ReversedLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {5, 4, 3, 2, 1, 0};

        assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase2() {
        Week9ReversedLinkedList.LinkedList test = newLinkedList(new int[] {0});
        List<Integer> result = toArrayList(Week9ReversedLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {0};

        assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase3() {
        Week9ReversedLinkedList.LinkedList test = newLinkedList(new int[] {0, 1});
        List<Integer> result = toArrayList(Week9ReversedLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {1, 0};

        assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase4() {
        Week9ReversedLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2});
        List<Integer> result = toArrayList(Week9ReversedLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {2, 1, 0};

        assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase5() {
        Week9ReversedLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3});
        List<Integer> result = toArrayList(Week9ReversedLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {3, 2, 1, 0};

        assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase6() {
        Week9ReversedLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5, 6});
        List<Integer> result = toArrayList(Week9ReversedLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {6, 5, 4, 3, 2, 1, 0};

        assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase7() {
        Week9ReversedLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        List<Integer> result = toArrayList(Week9ReversedLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        assertTrue(arraysEqual(result, expected));
    }


    public Week9ReversedLinkedList.LinkedList newLinkedList(int[] values) {
        Week9ReversedLinkedList.LinkedList ll = new Week9ReversedLinkedList.LinkedList(values[0]);
        Week9ReversedLinkedList.LinkedList current = ll;
        for (int i = 1; i < values.length; i++) {
            current.next = new Week9ReversedLinkedList.LinkedList(values[i]);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> toArrayList(Week9ReversedLinkedList.LinkedList ll) {
        List<Integer> arr = new ArrayList<Integer>();
        Week9ReversedLinkedList.LinkedList current = ll;
        while (current != null) {
            arr.add(current.value);
            current = current.next;
        }
        return arr;
    }

    public boolean arraysEqual(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) return false;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) return false;
        }
        return true;
    }
}