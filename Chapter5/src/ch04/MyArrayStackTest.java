package ch04;

public class MyArrayStackTest {
    public static void main(String[] args) {

        MyArrayStack stack = new MyArrayStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);


        stack.printAll();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
