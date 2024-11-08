package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SmallestEvenMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findSmallestEven(n));
	}

	private static int findSmallestEven(int n) {
		// TODO Auto-generated method stub
		if(n %2 ==0) {
			return n;
		}
		return n*2;
	}

}
