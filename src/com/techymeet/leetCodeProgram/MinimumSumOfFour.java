package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSumOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findMinimumSum(n));
	}

	private static int findMinimumSum(int n) {
		// TODO Auto-generated method stub
		String s = String.valueOf(n);
		char[] c = s.toCharArray();
		Arrays.sort(c);
		int num1 = Character.getNumericValue(c[0]) * 10+ Character.getNumericValue(c[2]);
		int num2 = Character.getNumericValue(c[1]) * 10 + Character.getNumericValue(c[3]);
		return num1+num2;
	}

}
