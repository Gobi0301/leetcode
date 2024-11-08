package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class MaximumDifferenceRemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(findMaximumDiff(num));

	}

	private static int findMaximumDiff(int num) {
		// TODO Auto-generated method stub
		StringBuilder sb1  = new StringBuilder();
		StringBuilder sb2   = new StringBuilder();
		char[] c = String.valueOf(num).toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i] == '1') {
			sb1.append(9);
			sb2.append(0);
			}
			else if(c[i] == '0') {
				sb1.append(9);
				sb2.append(9);
			}
			else {
				sb1.append(c[i]);
				sb2.append(c[i]);
			}	
		}
		int sum = Integer.parseInt(sb1.toString()) - Integer.parseInt(sb2.toString());
		
		return sum;
	}

}
