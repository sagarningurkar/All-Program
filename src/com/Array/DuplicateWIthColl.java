package com.Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWIthColl {

	public static void main(String[] args) {
		
		int arr[] = {1,4,5,3,6,2,1,5,9,5};
		
		Set<Integer> no = new HashSet<Integer>();
		
		for(int i=0; i<= arr.length-1; i++)
		{
			if(no.contains(i))
			{
				System.out.println("Duplicate element:"+ arr[i]);
			}
			else
			{
				no.add(arr[i]);
			}
		}
		
	}
}
