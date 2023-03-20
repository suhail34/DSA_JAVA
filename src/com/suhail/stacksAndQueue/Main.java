package com.suhail.stacksAndQueue;

public class Main {
    public static void main(String[] args) throws Exception {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(1);
//        stack.push(3);
//        stack.push(0);
//        stack.push(5);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        DynamicStack stack1 = new DynamicStack(5);
//        stack1.push(5);
//        stack1.push(2);
//        stack1.push(1);
//        stack1.push(6);
//        stack1.push(4);
//        stack1.push(3);
//
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());

//        CustomQueue queue = new CustomQueue(4);
//        queue.add(3);
//        queue.add(4);
//        queue.add(1);
//        queue.add(2);
//
//        queue.display();
//        System.out.println(queue.remove());
//
//        queue.display();
//        System.out.println(queue.front());

        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.add(4);
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.add(0);
        circularQueue.display();
        System.out.println(circularQueue.remove());
        circularQueue.display();
        circularQueue.add(6);
        circularQueue.display();
        System.out.println(circularQueue.front());

    }
}
