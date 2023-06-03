package com.suhail.basicques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ArrayComparator implements Comparator<ArrayList<Integer>> {
    @Override
    public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
        return a.get(1)-b.get(1);
    }
}

public class SortbySecond {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int idx=0; idx<5; idx++){
            arr.add(new ArrayList<>());
        }
        arr.get(0).add(2);
        arr.get(0).add(5);
        arr.get(1).add(3);
        arr.get(1).add(2);
        arr.get(2).add(5);
        arr.get(2).add(0);
        arr.get(3).add(6);
        arr.get(3).add(3);
        arr.get(4).add(7);
        arr.get(4).add(1);

        Collections.sort(arr, new ArrayComparator());
        System.out.println(arr);
    }
}
