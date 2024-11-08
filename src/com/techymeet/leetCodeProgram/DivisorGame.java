package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class DivisorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =  new Scanner(System.in);
		int  n = sc.nextInt();
		System.out.println(findDivisorGame(n));

	}

	private static boolean findDivisorGame(int n) {
		// TODO Auto-generated method stub
		if(n %2 == 0) {
			return true;
		}
		return false;
	}

}
