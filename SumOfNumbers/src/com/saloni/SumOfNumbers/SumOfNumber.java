package com.saloni.SumOfNumbers;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int num = sc.nextInt();
		int revNum = 0;
		int rem;
		
		int originalNum = num;
		while(num!=0) {
			rem = num%10;
			revNum = revNum*10+rem;
			//num=num/10;
			
		}
		
		if(originalNum == revNum) {
			System.out.println(originalNum +"is palindrome");
		}
		else {
			System.out.println(originalNum +"is not a palindrome");
		}
	}
	
	
}