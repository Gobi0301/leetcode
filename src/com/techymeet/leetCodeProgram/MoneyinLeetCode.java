package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class MoneyinLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateMoney(n));

	}

	private static int calculateMoney(int n) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i=0;i<n;i++) {
			total += (i/7 +1) + (i%7);
		}
		return total;
	}

}
