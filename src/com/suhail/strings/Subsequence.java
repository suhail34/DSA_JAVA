package com.suhail.strings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
//        subseq("","abc");
//        System.out.println(subseqList("","abc"));
        System.out.println(subseqAsciiList("","abc"));
    }

    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    public static ArrayList<String> subseqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> leftAns = subseqList(p+ch, up.substring(1));
        ArrayList<String> rightAns = subseqList(p, up.substring(1));
        leftAns.addAll(rightAns);

        return leftAns;
    }

    public static ArrayList<String> subseqAsciiList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> leftAns = subseqAsciiList(p+ch, up.substring(1));
        ArrayList<String> rightAns = subseqAsciiList(p,up.substring(1));
        ArrayList<String> asciiAns = subseqAsciiList(p+(ch+0),up.substring(1));
        leftAns.addAll(rightAns);
        leftAns.addAll(asciiAns);

        return leftAns;
    }

}
