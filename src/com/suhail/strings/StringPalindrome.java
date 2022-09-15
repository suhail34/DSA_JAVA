package com.suhail.strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abcdba";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {

        if(str == null || str.length() == 0){
            return true;
        }

        str = str.toLowerCase();
        for(int idx = 0; idx < str.length(); idx++){
            if(str.charAt(idx) != str.charAt(str.length() - 1 - idx)){
                return false;
            }
        }
        return true;
    }
}
