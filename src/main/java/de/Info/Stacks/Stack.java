package de.Info.Stacks;

import java.util.EmptyStackException;

public class Stack {

    private int[] stack;

    public Stack() {
        stack = new int[0];
    }

    public void push(int item) {
        int[] newstack = new int[stack.length+1];
        newstack[0] = item;

        for (int i = 1; i < newstack.length; i++)
            newstack[i] = stack[i-1];

        this.stack = newstack;
    }

    public int pop() {
        if (stack.length > 0) {
            int[] newstack = new int[stack.length-1];
            for (int i = 0; i < newstack.length; i++)
                newstack[i] = stack[i+1];

            int oldTop = stack[0];
            this.stack = newstack;
            return oldTop;
        }
        throw new EmptyStackException();
    }

    public int readTop() {
        if (stack.length > 0)
            return stack[0];
        throw new EmptyStackException();
    }

    public boolean isEmpty() {
        if (stack.length == 0)
            return true;
        return false;
    }

    public void printStack() {
        System.out.println("Printing Stack:");
        for (int i = 0; i < stack.length; i++)
            System.out.println("Item: " + stack[i]);
        System.out.println("Stack printed.");
    }

}
