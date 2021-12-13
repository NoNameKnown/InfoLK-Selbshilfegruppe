package de.Info.Queue;

public class MyQueueNode {

    private int value;
    private MyQueueNode next;

    public MyQueueNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public MyQueueNode getNext() {
        return next;
    }

    public void setNext(MyQueueNode next) {
        this.next = next;
    }
}
