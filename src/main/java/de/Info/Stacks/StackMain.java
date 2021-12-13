package de.Info.Stacks;

public class StackMain {

    private static void testStack() {
        System.out.println("#########################################");
        System.out.println("Testing Stack");
        System.out.println("#########################################");
        Stack stack = new Stack();
        System.out.println("Adding to Stack: " + 1);
        stack.push(1);
        System.out.println("Adding to Stack: " + 2);
        stack.push(2);
        System.out.println("Adding to Stack: " + 3);
        stack.push(3);
        System.out.println("Adding to Stack: " + 4);
        stack.push(4);
        System.out.println("Adding to Stack: " + 5);
        stack.push(5);
        System.out.println("Adding to Stack: " + 6);
        stack.push(6);
        System.out.println("Adding to Stack: " + 7);
        stack.push(7);

        System.out.println("Top Item: " + stack.readTop());

        System.out.println("Popping all Items");

        while (!stack.isEmpty()) {
            System.out.println("Item: " + stack.pop());
        }

        System.out.println("Stack tested");
    }

    // Kein Algorithmus. Nur Loesungsweg abgetippt
    private static void solveWaggonProblem() {
        System.out.println("#########################################");
        System.out.println("Waggon Problem");
        System.out.println("#########################################");
        Stack a = new Stack();
        Stack b = new Stack();
        Stack c = new Stack();

        System.out.println("Filling A");
        a.push(16);
        a.push(11);
        a.push(15);
        a.push(14);

        System.out.println("In A:");
        a.printStack();

        System.out.println("Sorting");
        c.push(a.pop());
        c.push(a.pop());
        b.push(c.pop());
        b.push(c.pop());
        c.push(a.pop());
        c.push(a.pop());
        // Schritt 7 ???? Wofuer die Helfer
        a.push(c.pop());
        c.push(b.pop());
        c.push(b.pop());
        c.push(a.pop());

        c.printStack();
    }

    public static void main(String[] args) {
        testStack();
        solveWaggonProblem();
    }

}
