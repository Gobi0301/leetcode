package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(powerOfTwo(n));

	}

	private static boolean powerOfTwo(int n) {
		// TODO Auto-generated method stub
		while(n>1) {
			if(n%2 == 0) {
				n /=2;
			}
			else  {
				return false;
			}
		}
		if(n == 0 || n<0)
		    return false;
		
		return true;
	}

}
