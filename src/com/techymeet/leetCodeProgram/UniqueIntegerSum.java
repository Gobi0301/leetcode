package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueIntegerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Arrays.toString(uniqueIntSum(n)));
	}

	private static int[] uniqueIntSum(int n) {
		// TODO Auto-generated method stub
		int[] arr = new int[n];
		int sum =0;
		for(int i=0;i<n-1;i++) {
			arr[i] = i+1;
			sum +=arr[i];
		}
		arr[n-1] = -sum;
		return arr;
	}

}
