package de.Info.Queue;

public class MyQueue {

    private MyQueueNode head;
    private MyQueueNode tail;

    public MyQueue() {
        head = null;
        tail = null;
    }

    public void add(int value) {
        if (head == null) {
            head = tail = new MyQueueNode(value);
        } else {
            tail.setNext(new MyQueueNode(value));
            tail = tail.getNext();
        }
    }

    public void delete(int value) {
        for (var node = head; node != null; node = node.getNext())
            if (node.getNext() != null && node.getNext().getValue() == value)
                node.setNext(node.getNext().getNext());
    }

    public void printQueue() {
        System.out.println("++++[Print]++++");
        for (var node = head; node != null; node = node.getNext()) {
            System.out.println(node.getValue());
        }
        System.out.println("----[Print]----");
    }

}
