package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SteptoReduceZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(stepNum(n));

	}

	private static int stepNum(int n) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int count = 0;
		while(flag) {
			if(n %2 ==0) {
				n = n/2;
				count++;
			}
			else if(n%2 != 0) {
				n = n-1;
				count++;
			}
			if(n == 0) {
				flag = !flag;
			}
		}
		return count;
	}

}
