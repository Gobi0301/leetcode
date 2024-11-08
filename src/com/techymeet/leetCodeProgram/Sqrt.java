package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sqrt(n));
	}

	private static int sqrt(int n) {
		// TODO Auto-generated method stub
		
		int ans = (int)Math.sqrt(n);
		return ans;
	}

}
