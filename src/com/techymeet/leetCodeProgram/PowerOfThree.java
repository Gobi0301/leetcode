package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findPowerThree(n));
	}

	private static boolean findPowerThree(int n) {
		// TODO Auto-generated method stub
		if(n<=0) {
			return false;
		}
		while(n%3==0) {
			n/=3;
		}
		return n==1;
		
	}

}
