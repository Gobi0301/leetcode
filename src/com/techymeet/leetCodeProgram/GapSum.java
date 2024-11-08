package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class GapSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int gap = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		//System.out.println(gapSum(arr,gap));
		gapSum(arr,gap);
	}

	private static void gapSum(int[] arr, int gap) {
		// TODO Auto-generated method stub
		for(int i=0;i<gap;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j=j+gap) {
				sum = sum+arr[j];
				
			}
			System.out.print(sum+" ");
		}
		//return null;
	}

}
