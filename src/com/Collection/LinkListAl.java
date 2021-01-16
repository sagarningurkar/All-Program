package com.Collection;

import java.util.LinkedList;

public class LinkListAl {

	public static void main(String[] args) {
		
		LinkedList al = new LinkedList();
		
		al.add("1");
		al.add("Sagar");
		al.add("Sagar");
		al.add(null);
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
	}
}
