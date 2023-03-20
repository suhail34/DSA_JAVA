package com.suhail.basicques;

public class DecodeToken {
    public static void main(String[] args) {
        String str = "abc 'mqr abc def' uvw 'xyz tpq' syz ";
        String[] arr=str.split(" ");
        String token="";
        for(int idx=0; idx<arr.length;idx++){
            if(arr[idx].startsWith("'")){
                token=token+arr[idx]+" ";
                while(!arr[++idx].endsWith("'")){
                    token=token+arr[idx]+" ";
                }
                token=token+arr[idx];
                System.out.println(token);
            }else {
                System.out.println(arr[idx]);
            }
            token="";
        }
    }
}
