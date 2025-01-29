package com.megha.recursion;

import java.util.Scanner;

public class ReverseString {
	static String reverse(String s,String r, int i) {
		if(i==-1) {
			return r;
		}
		return reverse(s,r+s.charAt(i),i-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverse(s,"",s.length()-1));
	}
}
