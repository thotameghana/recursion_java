package com.megha.recursion;

import java.util.Scanner;

public class ValindParanthesisCombinations {
	static void validCombinations(char[] ch,int n, int i, int o, int c) {
		if(i==ch.length) {
			System.out.println(ch);
		}
		if(o<n) {
			ch[i]='(';
			validCombinations(ch, n, i+1, o+1, c);
		}
		if(c<o) {
			ch[i]=')';
			validCombinations(ch, n, i+1, o, c+1);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		char[] ch=new char[n*2];
		int i=0,o=0,c=0;
		validCombinations(ch,n,i,o,c);
	}
}
