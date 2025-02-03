package com.megha.recursion;

import java.util.Scanner;

public class PowerOf {
	static long powerOf1(int x,int y) {
		if(y==0) {
			return 1;
		}
		return powerOf1(x,y-1)*x;
	}
	static long powerOf2(int x,int y) {
		if(y==0) {
			return 1;
		}
		if(y%2==0) {
			return powerOf2(x,y/2)*powerOf2(x,y/2);
		}
		else {
			return powerOf2(x,y-1)*x;
		}
	}
	static long powerOf3(int x,int y) {
		if(y==0) {
			return 1;
		}
		if(y%2==0) {
			long res=powerOf3(x,y/2);
			return res*res;
		}
		else {
			return powerOf3(x,y-1)*x;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		//approach 1
		System.out.println(powerOf1(x,y));
		//approach 2
		System.out.println(powerOf2(x,y));
		//approach 3
		System.out.println(powerOf3(x,y));
	}
}
