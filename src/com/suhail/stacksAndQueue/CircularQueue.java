package com.suhail.stacksAndQueue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int front = 0;
    int end = 0;
    int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean add(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove no elements in Queue");
        }
        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("No Front Element to Display");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int idx = front;
        do {
            System.out.print(data[idx]+"->");
            idx++;
            idx%=data.length;
        }while (idx!=end);
        System.out.println("End");
    }

    protected boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
