package algo;

import java.util.ArrayList;

public class Week9ReversedLinkedList {
    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.
//        LinkedList headNode = null;
//        ArrayList<LinkedList> list = new ArrayList<>();
//        LinkedList currentNode = head;
//        while(currentNode != null){
//            list.add(currentNode);
//            currentNode = currentNode.next;
//        }
//        for (int index = list.size() - 1; index <=0; index--){
//            if (index == 0){
//                list.get(index).next = null;
//                break;
//            }
//            LinkedList currentLinkedList = list.get(index);
//            currentLinkedList.next = list.get(index - 1);
//        }
//        head = list.get(list.size() - 1);
//        return head ;

        LinkedList previousLinkedListToBeMadeCurrent = null;
        LinkedList currentLinkedList = head;
        LinkedList nextLinkedList = null;
        while(currentLinkedList != null){
            nextLinkedList = currentLinkedList.next;
            currentLinkedList.next = previousLinkedListToBeMadeCurrent;
            previousLinkedListToBeMadeCurrent = currentLinkedList;
            currentLinkedList = nextLinkedList;
        }
        head=previousLinkedListToBeMadeCurrent;
        return head;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
