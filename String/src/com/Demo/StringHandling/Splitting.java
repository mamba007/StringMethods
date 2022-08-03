package com.Demo.StringHandling;

public class Splitting {
	public static void main(String[] args) {
		String str = "String Handling is easy to learn";
		String[] strings = str.split(" ");
		
		for(String s: strings) {
			System.out.println(s);
		}
	}
}
