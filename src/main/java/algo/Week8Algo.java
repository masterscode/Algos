package algo;

import java.util.*;

/**
 * Write a function that takes in the head of a Singly Linked List and an integer k and removes the kth node from the end of the list.
 *
 * The removal should be done in place, meaning that the original data structure should be mutated (no new structure should be created).
 *
 * Furthermore, the input head of the linked list should remain the head of the linked list after the removal is done, even if the head is the node that's supposed to be removed.
 *
 * In other words, if the head is the node that's supposed to be removed, your function should simply mutate its value and next pointer.
 *
 * Note that your function doesn't need to return anything.
 *
 * You can assume that the input Linked List will always have at least two nodes and, more specifically, at least k nodes.
 *
 * Each LinkedList node has an integer value as well as a next node pointing to the next node in the list or to None / null if it's the tail of the list.
 */

public class Week8Algo {
    public static void main(String[] args) {

    }
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        ArrayList<LinkedList> list = new ArrayList<>();
        var current = head;
       while(current.next != null){
           list.add(current);
           current = current.next;
       }
       var nodeToRemove = list.remove(list.size() - k);
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}


//class Program {
//    public static void removeKthNodeFromEnd(LinkedList head, int k) {
//
//    /* I would like to see the implementation for this problem cos i feel since we
//    //don't have access to the complete list any mutation made in this method cannot be
//    //sustained since only the head node is being passed in;
//    //probably a pass by reference approach would have been better;
//    //and according to the test case provided i don't see how that relates to our own challenge
//
//    what is being done in the test case is that an integer array is being passed in to the method and there are helper methods that takes each entry of the array and make it a LinkedList object while still have the complete list at its disposal;
//    in our case we only have access to a single element in the linkedlist;
//
//    OR PROBABLY I DON'T UNDERSTAND THE QUESTION
//
//*/
//        ArrayList<LinkedList> list = new ArrayList<>();
//        var current = head;
//        while(current != null){
//            list.add(current);
//            current = current.next;
//        }
//        var nodeToRemove = list.remove(list.size() - k );
//        return;
//    }
//
//    static class LinkedList {
//        int value;
//        LinkedList next = null;
//
//        public LinkedList(int value) {
//            this.value = value;
//        }
//    }
//}