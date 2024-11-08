package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class IntegerBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(integerBreak(n));
	}

	private static int integerBreak(int n) {
		// TODO Auto-generated method stub
		if(n <= 1) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		if (n == 3) {
			return 2;
		}
		int result = 1;
		while(n>4) {
			result *=3;
			n-=3;
		}
		result *=n;
		return result;
	}

}
