package com.binarysearch.demo;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a= {2,3,5,7,8,9};
		
		int srch=9;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		
		while (li<=hi)
		{
			if(a[mi]==srch)
			{
				System.out.println("Element is at "+mi+" index position ");
				break;
			}
			else if (a[mi]<srch)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi)
		{
			System.out.println("Element not Found");
		}
	}

}
