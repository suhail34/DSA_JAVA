package com.suhail.strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        System.out.println(letterComboCount("","12"));
        letterCombo("","12");
    }

    public static void letterCombo(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';

        for(int idx = (digit-1)*3;idx<(digit*3);idx++){
            char ch = (char) ('a'+idx);
            letterCombo(processed+ch,unprocessed.substring(1));
        }
    }

    public static ArrayList<String> letterComboRet(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0';
        ArrayList<String> all =  new ArrayList<>();
        for(int idx = (digit-1)*3;idx<(digit*3);idx++){
            char ch = (char) ('a'+idx);
            all.addAll(letterComboRet(processed+ch,unprocessed.substring(1)));
        }
        return all;
    }

    public static int letterComboCount(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
//            System.out.println(processed);
            return 1;
        }

        int digit = unprocessed.charAt(0) - '0';
        int count = 0;

        for(int idx = (digit-1)*3;idx<(digit*3);idx++){
            char ch = (char) ('a'+idx);
            count+=letterComboCount(processed+ch,unprocessed.substring(1));
        }
        return count;
    }

}
