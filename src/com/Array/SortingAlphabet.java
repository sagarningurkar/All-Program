package com.Array;

import java.util.Arrays;

public class SortingAlphabet {

	public static void main(String[] args) {
		
		String [] st = new String[] {"C","F","Y","O","A"};
		
		Arrays.sort(st);
		
		System.out.println("ENter String:");
		
		for(int i=0; i<st.length; i++)
		{
			System.out.println(st[i]);
		}
		
	}
}
