package com.Demo.StringHandling;

public class ReverseString {
	public static void main(String[] args) {
		String str = "reverse me";
		
		char[] arr = str.toCharArray();
		
		for(int left = 0,right = arr.length-1; left<right; left++,right--) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right]= temp;
		}
		for(char ch: arr) {
			System.out.print(ch);
		}
	}
}
