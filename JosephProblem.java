package com.megha.recursion;

import java.util.Scanner;

public class JosephProblem {
	static int joseph(int n,int k) {
		if(n==1) {
			return 0;
		}
		return (joseph(n-1,k)+k)%n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println("The safe Position is "+joseph(n,k));
	}
}
