package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(findPerfectNum(num));

	}

	private static boolean findPerfectNum(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		if(num%2 !=0) {
			return false;
		}
		else {
			for(int i=1;i<=num/2;i++) {
				if(num%i == 0) {
					sum+=i;
				}
			}
		}
		return num == sum;
	}

}
