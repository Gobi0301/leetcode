package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CountEvenSumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(countEven(num));

	}

	private static int countEven(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=2;i<=num;i++) {
			if(sum(i)) {
				count++;
			}
		}
	return count;
	}

	private static boolean sum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return (sum&1) == 0;
	}

}
