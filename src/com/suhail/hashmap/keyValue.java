package com.suhail.hashmap;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class keyValue {
    public static void main(String[] args) {
        HashMap<String,String> dict = new HashMap<>();
        dict.put("name","suhail");
        dict.put("age","21");
        dict.put("city","mumbai");
        dict.replace("city","delhi");
//        System.out.println(dict);

        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(2,2);
        map.put(5,1);
        map.put(50,1);
        map.put(1,1);

        Map.Entry<Integer,Integer> actualValue = map.entrySet().iterator().next();

        Map.Entry<Integer, Integer> expectedValue = new AbstractMap.SimpleEntry<Integer, Integer>(2,2);

        System.out.println("Actual Value: "+actualValue+" Expected Value: "+expectedValue);
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            System.out.println(entry);
        }
    }
}
