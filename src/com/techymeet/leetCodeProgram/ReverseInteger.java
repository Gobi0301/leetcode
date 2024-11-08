package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverseInt(n));

	}

	private static int reverseInt(int n) {
		// TODO Auto-generated method stub
		long finalNum = 0;
		while(n != 0) {
			int lastDigit = n % 10;
			finalNum += lastDigit;
			finalNum = finalNum * 10;
			n /=10;
		}
		finalNum = finalNum / 10;
		if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE) {
			return 0;
		}
		if(n < 0) {
			return (int)(-1*finalNum);
		}
		return (int)finalNum;
	}

}
