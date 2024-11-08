package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class GetMaximumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(maxArray(n));

	}

	private static int maxArray(int n) {
		// TODO Auto-generated method stub
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		int max = Integer.MIN_VALUE;
		for(int i=2;i<arr.length;i++) {
			if(i % 2 == 0) {
				arr[i] = arr[i/2];
			}
			else {
				arr[i] = arr[i/2] + arr[(i/2) + 1];
			}
			max = Math.max(max, arr[i]);
		}
		return max;
	}

}
