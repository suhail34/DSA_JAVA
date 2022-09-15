package com.suhail.binary_search;

public class SmallestLetters {
    public static void main(String[] args) {
        char[] arr = {'c' , 'i', 'j' , 'm'};
        char target = 'c';
        char ans = search(arr, target);
        System.out.println(ans);
    }

    static char search(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        if(target >= arr[end]){
            return arr[start];
        }

            while(start <= end){
                int mid = start + (end - start)/2;

                if(arr[mid] > target){
                    end = mid - 1;
                }else {
                    start  = mid + 1;
                }
            }

        return arr[start % arr.length];
    }
}
