package com.suhail.strings;

import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        System.out.println(ComboFaceRet("", 5,6));
//        ComboFace("", 7, 7);
    }

    public static void Combo(String processed, int target){
        if(target == 0){
            System.out.println(processed);
            return;
        }

        for (int idx = 1; idx <= 6 && idx <= target; idx++){
            Combo(processed+idx,target-idx);
        }
    }

    public static ArrayList<String> ComboRet(String processed, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int idx = 1; idx <= 6 && idx <= target; idx++){
            ans.addAll(ComboRet(processed+idx,target-idx));
        }
        return ans;
    }

    public static void ComboFace(String processed, int target, int face){
        if(target == 0){
            System.out.println(processed);
            return;
        }

        for (int idx = 1; idx <= face && idx <= target; idx++){
            ComboFace(processed+idx,target-idx, face);
        }
    }

    public static ArrayList<String> ComboFaceRet(String processed, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int idx = 1; idx <= face && idx <= target; idx++){
            ans.addAll(ComboFaceRet(processed+idx,target-idx, face));
        }
        return ans;
    }

}
