package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CountDigitThatDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countDigit(n));

	}

	private static int countDigit(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = n;
		while(n != 0) {
			int remain = n % 10;
			if(num % remain == 0) {
				count++;
			}
			n = n/10;
		}
		return count;
	}

}
