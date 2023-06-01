package com.suhail.heaps;

import java.util.PriorityQueue;

public class Heap {
    int[] arr = new int[100];
    int size;

    public Heap(){
        arr[0]=-1;
        size=0;
    }

    public void insert(int num){
        size = size+1;
        int index = size;
        arr[index] = num;

        while (index > 1) {
            int parent = index/2;

            if(arr[parent]<arr[index]) {
                int temp = arr[parent];
                arr[parent]=arr[index];
                arr[index]=temp;
                index=parent;
            }else {
                return;
            }
        }
    }

    public void delete(){

        if(size == 0) {
            System.out.println("Nothing to delete");
            return;
        }

        arr[1] = arr[size];
        size--;

        int i = 1;
        while (i < size) {
            int leftIdx = 2*i;
            int rightIdx = 2*i + 1;

            if(leftIdx < size && arr[leftIdx]>arr[i]){
                int temp = arr[i];
                arr[i]=arr[leftIdx];
                arr[leftIdx]=temp;
                i=leftIdx;
            } else if(rightIdx < size && arr[rightIdx] > arr[i]){
                int temp = arr[i];
                arr[i] = arr[rightIdx];
                arr[rightIdx] = temp;
                i=rightIdx;
            }else {
                return;
            }
        }
    }

    public static void heapify(int[] arr, int size, int idx) {
        int largest = idx;
        int right = 2*idx + 1;
        int left = 2*idx;

        if(left <= size && arr[largest]<arr[left]) {
            largest=left;
        }
        if(right <= size && arr[largest]<arr[right]) {
            largest=right;
        }

        if(largest != idx) {
            int temp = arr[largest];
            arr[largest]=arr[idx];
            arr[idx]=temp;
            heapify(arr,size,largest);
        }
    }

    public void print(){
        for (int idx = 1; idx <= size ; idx++) {
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }

    public static void heapsort(int[] arr, int size) {
        int t = size;

        while (t > 1) {
            // step 1 swap root element of heap with last element
            int temp = arr[t];
            arr[t] = arr[1];
            arr[1] = temp;
            t--;

            // step 2 heapify the swapped element
            heapify(arr, t, 1);
        }
    }

    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.insert(50);
        hp.insert(55);
        hp.insert(53);
        hp.insert(52);
        hp.insert(54);
        hp.print();
        hp.delete();
        hp.print();

        int[] arr = {-1, 54, 53, 55, 52, 50};
        int size = arr.length - 1;

        for (int idx = size/2; idx > 0; idx--) {
            heapify(arr, size, idx);
        }

        for (int idx = 1; idx <= size; idx++) {
            System.out.print(arr[idx]+" ");
        }
        System.out.println();

        heapsort(arr, size);
        System.out.println("HeapSort : ");
        for (int idx = 1; idx <= size; idx++) {
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
