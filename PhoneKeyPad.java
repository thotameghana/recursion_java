package com.megha.recursion;

import java.util.Scanner;

public class PhoneKeyPad {
	static String[] keys= {"","","abc","def","ghi","jkl","mno","pqrs","utv","wxyz"};
	static void phoneKeypad(String s, String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		String key=keys[s.charAt(0)-48];
		for(int i=0;i<key.length();i++) {
			phoneKeypad(s.substring(1),ans+key.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		phoneKeypad(s,"");
	}
}
