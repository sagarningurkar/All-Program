package com.StringS;

public class Reverse {

	public static void main(String[] args) {
		
	//	StringBuffer sb = new StringBuffer("I am sagar");
	//	sb.reverse();
	//	System.out.println("The reverse of String:"+ sb);
		
		String s = "Sagar";
		
		for(int i= s.length()-1; i>=0; i--)
		{
		System.out.println(s.charAt(i));
		}
		System.out.print(s);
	}
}
