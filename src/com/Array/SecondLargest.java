package com.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
	
		
		int arr[] = {3,6,4,2,68,12};
		int n = arr.length;
		
		Arrays.sort(arr);
		int Second_largest = arr[n-2];
		System.out.println("Second Largest :"+ Second_largest);
		
	}

}
