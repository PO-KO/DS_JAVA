public class StackLinkedList {
    class Node {
        int item;
        Node next;
    }

    Node top;
    public StackLinkedList() {
        top = null;
    }

    public void push(int element) {
        Node newItem = new Node();
            newItem.item = element;
            newItem.next = top;
            top = newItem;
        
    }

    public void pop() {
        if(top != null) {
            Node temp = top;
            top=top.next;
            temp.next = null;
        } else {
            System.out.println("Stack is empty");
        }
    }
}
