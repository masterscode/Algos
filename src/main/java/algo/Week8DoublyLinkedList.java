package algo;

public class Week8DoublyLinkedList {

    // Feel free to add new properties and methods to the class.
    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            // Write your code here.
            if(this.getListSize() == 0){
                head = node;
            }else{
                Node nextNode = node.next;
                Node prevNode = node.prev;

                nextNode.prev = prevNode;
                prevNode.next = nextNode;

                head.prev = node;
                node.prev = null;
                node.next = head;
                head = node;

            }
        }

        public void setTail(Node node) {
            // Write your code here.
            if (getListSize() == 0){
                tail = node;
                return;
            }
            Node prevNode = node.prev;
            Node nextNode = node.next;

            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            node.prev = tail;
            tail.next = node;
            tail = node;
        }

        public int getListSize(){
            int size = 0;
            Node current = head;
            while(current != null){
                    size++;
                    current = current.next;
            }
            return size;
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
            Node previousNode = node.prev;
            previousNode.next = nodeToInsert;
            nodeToInsert.next = node;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
        }

        public void removeNodesWithValue(int value) {
            // Write your code here.
        }

        public void remove(Node node) {
            // Write your code here.
        }

        public boolean containsNodeWithValue(int value) {
            // Write your code here.
            boolean status = false;
            Node current = head;
            while(current != null){
                if (current.value == value){
                    status = true;
                    break;
                }
                current = current.next;

            }
            return status;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

