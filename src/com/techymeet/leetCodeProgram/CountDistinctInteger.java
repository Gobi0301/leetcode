package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CountDistinctInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findCountDistinct(n));
	}

	private static int findCountDistinct(int n) {
		// TODO Auto-generated method stub
		if(n == 1) {
			return 1;
		}
		return n-1;
	}

}
