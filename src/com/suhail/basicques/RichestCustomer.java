package com.suhail.basicques;

public class RichestCustomer {
    public static void main(String[] args) {
        int accounts[][] = {{1, 2, 3},{8, 9}, {3, 4, 1}};

        System.out.println(rich(accounts));
    }

    static int rich(int[][] accounts) {
        int sum[] = new int[accounts.length];
        int max = 0;
        for (int customer = 0; customer < accounts.length; customer++) {

            for (int bank = 0; bank < accounts[customer].length; bank++) {
                sum[customer] += accounts[customer][bank];
            }
            if(max < sum[customer]){
                max = sum[customer];
            }
        }
        return max;
    }
}
