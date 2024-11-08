package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ThreeDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findThreeDivisor(n));

	}

	private static boolean findThreeDivisor(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count == 3) {
			return true;
		}
		return false;
	}

}
