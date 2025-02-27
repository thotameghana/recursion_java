package com.megha.recursion;

import java.util.Scanner;

public class SumOfArray {
	static int sumOfArray(int[] a, int sum, int i) {
		if(i==-1) {
			return sum;
		}
		return sumOfArray(a, sum+a[i], i-1);
	}
	static int sumOfArray(int[] a,int i) {
		if(i==a.length) {
			return 0;
		}
		return sumOfArray(a,i+1)+a[i];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(sumOfArray(a,0,a.length-1));
		
		System.out.println(sumOfArray(a,0));
	}
}
