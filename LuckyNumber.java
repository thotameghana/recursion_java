package com.megha.recursion;

import java.util.Scanner;

public class LuckyNumber {
	static boolean luckyNumber(int n,int counter) {
		if(counter>n) {
			return true;
		}
		if(n%counter==0) {
			return false;
		}
		return luckyNumber(n-(n/counter),counter+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(luckyNumber(n,2));
	}
}
