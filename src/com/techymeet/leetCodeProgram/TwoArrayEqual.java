package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] num1 = new int[n];
		for(int i=0;i<num1.length;i++) {
			num1[i] = sc.nextInt();
		}
		int[] num2 = new int[k];
		for(int i=0;i<num2.length;i++) {
			num2[i] = sc.nextInt();
		}
		System.out.println(canBeEqual(num1,num2));

	}

	private static boolean canBeEqual(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		Arrays.sort(num2);
		Arrays.sort(num1);
		return Arrays.equals(num1, num2);
		
	}

}
