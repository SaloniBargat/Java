package com.saloni.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Fibonacci series  to be printed till :- ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 =0,n2=1;
		for(int i=1; i<=n; i++) {
			System.out.println(n1);
			
			int next = n1+n2;
			n1=n2;
			n2=next;
		}

	}

}
