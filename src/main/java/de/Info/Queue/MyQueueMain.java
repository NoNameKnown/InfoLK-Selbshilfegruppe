package de.Info.Queue;

public class MyQueueMain {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        for (int i = 1; i <= 20; i++)
            queue.add(i);

        queue.printQueue();
    }

}
