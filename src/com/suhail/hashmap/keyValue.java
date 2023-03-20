package com.suhail.hashmap;

import java.util.HashMap;

public class keyValue {
    public static void main(String[] args) {
        HashMap<String,String> dict = new HashMap<>();
        dict.put("name","suhail");
        dict.put("age","21");
        dict.put("city","mumbai");
        dict.replace("city","delhi");
        System.out.println(dict);
    }
}
