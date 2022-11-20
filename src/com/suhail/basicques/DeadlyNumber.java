package com.suhail.basicques;
import java.util.ArrayList;
import java.util.Scanner;

public class DeadlyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer Number : ");
        int n  = sc.nextInt();
        System.out.println("Greatest Deadily Number is : " + largestDeadlyDivisor(n));

    }

    public static int largestDeadlyDivisor(int A) {
        int prev=1;
        for(int i=128;i>0;i--){
            if(isApplicable(i) && A%i==0 && i<A){
                return i;
            }
        }
        return prev;
    }

    public static boolean isApplicable(int A){
        String binary=Integer.toBinaryString(A);
        int count1=0;
        int count0=0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='1'){
                count1++;
            }else{
                count0++;
            }
        }
        if(count0==count1-1){
            return true;
        }
        return false;
    }

}
