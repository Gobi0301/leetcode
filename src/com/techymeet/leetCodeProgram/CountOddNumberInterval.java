package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CountOddNumberInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high  = sc.nextInt();
		System.out.println(findOddNum(low,high));

	}

	private static int findOddNum(int low, int high) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=low;i<=high;i++) {
			if(i%2!=0) {
				count++;
			}
		}
		return count;
	}

}
