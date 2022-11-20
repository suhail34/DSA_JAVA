package com.suhail.strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        printAllPermutations("","abc");
//        ArrayList<String> ans = printAllPermutationsList("","abc");
        System.out.println(permutationsCount("","abc"));
    }

    public static void printAllPermutations(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        for(int idx=0; idx<=processed.length();idx++){
            String first = processed.substring(0,idx);
            String second = processed.substring(idx,processed.length());
            printAllPermutations(first+ch+second,unProcessed.substring(1));
        }
    }

    public static ArrayList<String> printAllPermutationsList(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int idx=0; idx<=processed.length();idx++){
            String first = processed.substring(0,idx);
            String second = processed.substring(idx,processed.length());
            ans.addAll(printAllPermutationsList(first+ch+second,unProcessed.substring(1)));
        }
        return ans;
    }

    public static int permutationsCount(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
//            System.out.println(processed);
            return 1;
        }

        char ch = unProcessed.charAt(0);
        int count = 0;

        for(int idx=0; idx<=processed.length();idx++){
            String first = processed.substring(0,idx);
            String second = processed.substring(idx,processed.length());
            count+=permutationsCount(first+ch+second,unProcessed.substring(1));
        }
        return count;
    }

}
