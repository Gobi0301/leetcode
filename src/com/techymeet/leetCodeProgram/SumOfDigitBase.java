package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SumOfDigitBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(sumOfDigit(n,k));

	}

	private static int sumOfDigit(int n, int k) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(n>0) {
			sum+= n % k;
			n=n/k;
		}
		return sum;
	}

}
