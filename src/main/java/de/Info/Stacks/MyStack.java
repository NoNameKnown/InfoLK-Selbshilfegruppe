package de.Info.Stacks;

public class MyStack {

    MyStackNode top;

    public MyStack() {
        top = null;
    }

    // push: Hinzufuegen -> void
    // pop: Herausnehmen
    // isEmpty: Leer oder nicht
    // top()


    /**
     * Fuegt den gegebenen Wert dem Stack hinzu
     * @param waggonnr Wert zum hinzufuegen
     */
    public void push(int waggonnr) {
        MyStackNode newNode = new MyStackNode(waggonnr);
        newNode.setNext(top);
        top = newNode;
    }

    /**
     * Gibt den Wert des obersten Elements im Stack aus und loescht dieses
     * @return Wert des obersten Elements
     */
    public int pop() {
        int value = top.getNumber();
        top = top.getNext();
        return value;
    }

    /**
     * Ueberprueft ob der Stack leer ist
     * @return ist der Stack leer?
     */
    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gibt den Wert des obersten Elements im Stack aus
     * @return Wert des obersten Elements
     */
    public int top() {
        return top.getNumber();
    }

    public void printStack() {
        System.out.println("++++[Print]++++");
        MyStackNode nd = top;
        while (nd != null) {
            System.out.println(nd.getNumber());
            nd = nd.getNext();
        }
        System.out.println("----[Print]----");
    }

}
