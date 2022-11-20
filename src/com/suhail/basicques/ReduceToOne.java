package com.suhail.basicques;

public class ReduceToOne {
    public static void main(String[] args) {
        int num = 3;
        int num2=2;
        int count=0;
        while(num>1){
            if(num%num2==0&&num2<num){
                num=num/num2;
                count++;
            }else if(num2>num){
                num2=2;
                num=num/num;
                count++;
            }
            num=num-1;
            count++;
            if (count%2==0){
                if(num%num2==0&&num2<num){
                    num=num/num2;
                    count++;
                }else if(num2>num){
                    num2=2;
                    num=num/num;
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
