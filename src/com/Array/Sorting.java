package com.Array;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String[] args) {
		
		int[] arr = new int [] {12,34,22,11,44,67,34,};
		
		Arrays.sort(arr);
		
		
		System.out.println("Elements of sort:");
		
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
