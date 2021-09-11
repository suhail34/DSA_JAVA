package com.suhail;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String[] arr = new String[3];
//
//        for (int idx = 0; idx < arr.length; idx++) {
//            arr[idx] = in.next();
//        }
//
//        for(String item : arr){
//            System.out.println(item);
//        }

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int idx = 0; idx < 3; idx++) {
            lists.add(new ArrayList<>());
        }

        for (int idx = 0; idx < 3; idx++) {
            for (int co = 0; co < 5; co++) {
                lists.get(idx).add(in.nextInt());
            }
        }

        System.out.println(lists);
    }
}