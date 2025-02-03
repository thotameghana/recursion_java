package com.megha.recursion;

import java.util.Scanner;

public class CountSubSetSum {
	static int countSubsetSum(int[] a,int sum, int i) {
		if(sum==0) {
			return 1;
		}
		if(sum<0) {
			return 0;
		}
		if(i==a.length) {
			return 0;
		}
		return countSubsetSum(a, sum-a[i], i+1)+countSubsetSum(a, sum, i+1);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		
		System.out.println(countSubsetSum(a, sum, 0));
	}
}
