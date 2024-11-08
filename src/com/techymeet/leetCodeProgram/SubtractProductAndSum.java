package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SubtractProductAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(subtractProductSum(n));

	}

	private static int subtractProductSum(int n) {
		// TODO Auto-generated method stub
		String s = String.valueOf(n);
		char[] c = s.toCharArray();
		int product=1,sum=0;
		for(int i=0;i<c.length;i++) {
			product *= Character.getNumericValue(c[i]);
			sum +=Character.getNumericValue(c[i]);
		}
		int res = product - sum;
		return res;
	}

}
