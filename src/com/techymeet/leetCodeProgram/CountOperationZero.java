package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CountOperationZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(findCount(num1,num2));

	}

	private static int findCount(int num1, int num2) {
		// TODO Auto-generated method stub
		int count = 0;
		while(num1!=0 && num2 !=0) {
			if(num1>=num2) {
				num1 = num1-num2;
				count++;
			}
			else if(num1<num2) {
				num2 = num2-num1;
				count++;
			}
		}
		return count;
	}

}
