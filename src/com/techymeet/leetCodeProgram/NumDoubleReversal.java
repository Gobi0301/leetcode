package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class NumDoubleReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(findNumReversal(num));
	}

	private static boolean findNumReversal(int num) {
		// TODO Auto-generated method stub
		int res = num;
		int n = 0;
		
		while(res >0) {
			int remain = res % 10;
			n = n * 10 + remain;
			res = res /10;
		}
		
		while(n > 0) {
			int remain = n % 10;
			res = res * 10 + remain;
			n = n / 10;
		}
		if(res == num) {
			return true;
		}
		
		
		
		return false;
	}

}
