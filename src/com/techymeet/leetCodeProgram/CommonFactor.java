package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b  = sc.nextInt();
		System.out.println(commonFact(a,b));
	}

	private static int commonFact(int a, int b) {
		// TODO Auto-generated method stub
		int count = 0;
		int min = Math.min(a, b);
		for(int i=1;i<=min;i++) {
			if(a%i == 0 && b%i == 0) {
				count++;
			}
		}
		return count;
	}

}
