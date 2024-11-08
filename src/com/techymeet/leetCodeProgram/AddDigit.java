package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class AddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(addDigit(num));

	}

	private static int addDigit(int num) {
		// TODO Auto-generated method stub
		if(num == 0)
			return 0;
		else if(num %9 ==0) {
			return 9;
		}
		else return num%9;
	}

}
