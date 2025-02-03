package com.megha.recursion;

import java.util.Scanner;

public class SubsequenceOfString {
	static void subsequence(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		//pick
		subsequence(s.substring(1),ans+s.charAt(0));
		//not pick
		subsequence(s.substring(1), ans);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		subsequence(s,"");
	}
}
