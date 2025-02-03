package com.megha.recursion;

import java.util.Scanner;

public class PermutationsOfString {
	static void swap(char[] ch,int i,int fi) {
		char temp=ch[i];
		ch[i]=ch[fi];
		ch[fi]=temp;
	}
	static void permutataions(char[] ch,int fi) {
		if(fi==ch.length-1) {
			System.out.println(ch);
			return;
		}
		for(int i=fi;i<ch.length;i++) {
			swap(ch,i,fi);
			permutataions(ch, fi+1);
			swap(ch,i,fi);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		permutataions(s.toCharArray(), 0);
	}
}
