package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class PivotInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findPivotInt(n));

	}

	private static int findPivotInt(int n) {
		// TODO Auto-generated method stub
		int totalSum = n * (n+1) / 2;
		int leftSum = 0;
		for(int i=1;i<=n;i++) {
			leftSum +=i;
			if(totalSum - leftSum + i == leftSum) {
				return i;
			}
		}
		return -1;
	}

}
