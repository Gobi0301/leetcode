package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findUlgyNum(n));

	}

	private static boolean findUlgyNum(int n) {
		// TODO Auto-generated method stub
		while((n%2==0 || n%3==0 || n%5==0) && n>1) {
			if(n%2 == 0)
				n = n/2;
			else if(n%3==0)
				n = n/3;
			else if(n%5==0)
				n = n/5;
		}
		return n==1;
		}

}
