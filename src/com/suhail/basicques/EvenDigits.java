package com.suhail.basicques;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 2, 45, 123, 7894, 1, 10, 3, 9, 10};

        System.out.println(search(arr));
    }

    static int search(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        int found = 0;
        for(int elem : arr){
            if(even(elem)){
                found++;
            }
        }
        return found;
    }

    static boolean even(int elem) {
        int count = 0;
        while(elem > 0){
            elem /= 10;
            count++;
        }
        return count%2 == 0;
    }
}
