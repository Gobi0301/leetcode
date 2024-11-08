package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ArithmeticTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int diff = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arithmetictriple(arr,diff));

	}

	private static int arithmetictriple(int[] arr, int diff) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[j] - arr[i] == diff && arr[k] - arr[j] ==diff) {
						count++;
					}
				}
			}
		}
		
		return count;
	}

}
