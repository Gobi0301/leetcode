package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SplitMinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(findSplitSum(num));

	}

	private static int findSplitSum(int num) {
		// TODO Auto-generated method stub
		StringBuilder sb1  = new StringBuilder();
		StringBuilder sb2  = new StringBuilder();
		char[] c  = String.valueOf(num).toCharArray();
		Arrays.sort(c);
		for(int i=0;i<c.length;i++) {
			if(c[i] % 2 == 0) {
				sb1.append(c[i]);
			}
			else {
				sb2.append(c[i]);
			}
		}
		int sum = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
		return sum;
	}

}
