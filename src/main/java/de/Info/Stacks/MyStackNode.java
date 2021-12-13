package de.Info.Stacks;

public class MyStackNode {

    private int number;
    private MyStackNode next;

    public MyStackNode(int number) {
        this.number = number;
        next = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNext(MyStackNode next) {
        this.next = next;
    }

    public MyStackNode getNext() {
        return next;
    }

}
