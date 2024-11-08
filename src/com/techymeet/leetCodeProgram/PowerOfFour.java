package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class PowerOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findPower(n));

	}

	private static boolean findPower(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return false;
		}
		if(n==1) {
			return true;
		}
		if(n%4!=0) {
			return false;
		}
		return findPower(n/4);
	}

}
