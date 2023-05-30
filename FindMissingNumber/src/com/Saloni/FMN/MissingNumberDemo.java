package com.Saloni.FMN;

import java.util.HashSet;

public class MissingNumberDemo {
	

	public static void main(String[] args) {
		 
	 }
	 
	 
	 public static void missingNumbers(Integer a[]) {
		 
		 HashSet<Integer> set=new HashSet<Integer>();
		 for(int num:a) {
			 set.add(num);
		 }
		 int n=a.length+1;
		 for (int i=0;i<n;i++) {
			 if(!set.contains(i)) {
				 System.out.println(i); 
			 }
		 }
	 }
	
}
