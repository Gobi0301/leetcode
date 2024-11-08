package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class DivideTwoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int diviend = sc.nextInt();
		int divisor = sc.nextInt();
		System.out.println(findDivide(diviend,divisor));

	}

	private static int findDivide(int diviend, int divisor) {
		// TODO Auto-generated method stub
		if(diviend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		if(diviend == Integer.MIN_VALUE && divisor == 1) {
			return Integer.MIN_VALUE;
		}
		int sub = diviend % divisor;
		return (diviend - sub)/divisor;
	}

}
