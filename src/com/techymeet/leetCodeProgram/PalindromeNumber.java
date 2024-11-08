package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number  = sc.nextInt();
		int r , temp ,sum=0;
		temp = number;
		while(number>0) {
			r = number%10;
			sum = (sum*10) + r;
			number = number/10;
		}
		if(temp == sum) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
