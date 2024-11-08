package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class PivotIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findPivotIndex(arr));

	}

	private static int findPivotIndex(int[] arr) {
		// TODO Auto-generated method stub
	int totalSum = 0;
	int leftSum = 0;
	for(int i:arr) {
		totalSum += i;
	}
	for(int i=0;i<arr.length;leftSum +=arr[i++]) {
		if(leftSum *2 == totalSum - arr[i])
			return i;
	}
		return -1;
	}

}
