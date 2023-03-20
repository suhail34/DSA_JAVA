package com.suhail.stacksAndQueue;

public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) throws StackException {

        if(this.isFull()){
            int[] temp = new int[data.length * 2];

            for (int idx = 0; idx < data.length; idx++){
                temp[idx]=data[idx];
            }
            data = temp;
        }
        return super.push(item);
    }
}
