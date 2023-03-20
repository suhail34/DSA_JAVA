package com.suhail.stacksAndQueue;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean add(int item) {

        if(this.isFull()){
            int[] temp = new int[data.length * 2];

            for (int idx = 0; idx < data.length; idx++){
                temp[idx]=data[(front+idx)%data.length];
            }
            front=0;
            end=data.length;
            data = temp;
        }

        return super.add(item);
    }
}
