package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class DivisibleAndNonDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(findDifferenceOfsum(n,m));

	}

	private static int findDifferenceOfsum(int n, int m) {
		// TODO Auto-generated method stub
		int sum1 =0,sum2=0;
		for(int i=1;i<=n;i++) {
			if(i%m !=0) {
				sum1 +=i;
			}
			else {
				sum2 +=i;
			}
		}
		int total = sum1 - sum2;
		return total;
	}

}
