package com.suhail.stacksAndQueue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean add(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int removed = data[0];

        for (int idx = 1; idx < end; idx++){
            data[idx-1]=data[idx];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is Empty can't display front");
        }
        return data[0];
    }

    protected boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public void display(){
        for (int idx = 0; idx < end; idx++){
            System.out.print(data[idx]+"<-");
        }
        System.out.println("End");
    }
}
