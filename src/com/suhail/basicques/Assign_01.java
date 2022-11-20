package com.suhail.basicques;

import java.util.Scanner;

public class Assign_01 {

	static long factorial(long num){
		long temp = num;
		long fact = 1;

		for (long start = temp; temp >= 1; temp--){
			fact = temp * fact;
		}
		return fact;
	}

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
	    long num = input.nextInt();

	    long fact = factorial(num);

        System.out.println("The factorial of the number "+ num + " is " + fact);

	    if(num % 2 == 0){
			System.out.println(num + " is a Even number");
		}else {
			System.out.println(num + " is a Odd number");
		}

		System.out.print("Enter your name: ");
	    String name = input.next();

		System.out.println("Hello " + name);
    }
}
