package com.megha.recursion;

import java.util.Scanner;

public class FibinocciSeries {
	static int fabi(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return fabi(n-1)+fabi(n-2);
	}
	public static void main(String[] args) {
//		System.out.println(fabi(6));
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(fabi(i)+" ");
		}
	}
}
