package de.Info.Stacks;

public class MyStackMain {

    public static MyStack doAlgo(MyStack A) {
        MyStack B  = new MyStack();
        MyStack C  = new MyStack();

        while (!A.isEmpty()) {
            if (C.isEmpty() || A.top() >= C.top()) {
                int a = A.pop();
                C.push(a);
            } else {
                while (!C.isEmpty()) {
                    int c = C.pop();
                    B.push(c);
                }
                int a = A.pop();
                C.push(a);
                while (!B.isEmpty()) {
                    int b = B.pop();
                    C.push(b);
                }
            }
        }

        return C;
    }

    public static void main(String[] args) {

        MyStack A = new MyStack();
        A.push(16);
        A.push(11);
        A.push(15);
        A.push(14);

        A.printStack();

        doAlgo(A).printStack();
    }

}
