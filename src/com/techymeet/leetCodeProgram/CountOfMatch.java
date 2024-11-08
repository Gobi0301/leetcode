package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CountOfMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countMatch(n));

	}

	private static int countMatch(int n) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int sum = 0;
		while(flag) {
			if(n%2==0) {
				sum += n/2;
				n = (n-1)/2 + 1;
			}
			else if(n%2 != 0) {
				sum += (n-1)/2 ;
				n = (n-1)/2 + 1;
			}
			if(n == 1) {
				flag = !flag;
			}
		}
		return sum;
	}

}
