package com.suhail.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyGame {

    public static void main(String[] args) {
        int[] arr={3,3,9,7,1,9};
        System.out.println(LargButMinFreq(arr,6));
    }
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here

        HashMap<Integer, Integer> map=new LinkedHashMap<>();
        for(int item:arr){
            map.put(item, map.getOrDefault(item,0)+1);
        }
        Map.Entry<Integer,Integer> firstEntry=map.entrySet().iterator().next();
        int maxElem=firstEntry.getKey(), minfreq=firstEntry.getValue();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if((entry.getValue()<minfreq && entry.getKey()>maxElem) || (entry.getValue()==minfreq && entry.getKey()>maxElem)){
                maxElem=entry.getKey();
                minfreq=entry.getValue();
            }
        }
        return maxElem;
    }
}
