package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class MaximumAchievable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int t = sc.nextInt();
		System.out.println(findmaximum(num,t));

	}

	private static int findmaximum(int num, int t) {
		// TODO Auto-generated method stub
		int size = num + t;
		for(int i=0;i<t;i++) {
			size++;
		}
		return size;
	}

}
