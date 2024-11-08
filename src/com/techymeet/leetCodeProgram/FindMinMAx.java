package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class FindMinMAx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findMaxMin(arr));
	}

	private static int findMaxMin(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length<=2)
			return -1;	
		else 
		return Math.max(Math.min(Math.max(arr[0], arr[1]), arr[2]), Math.min(arr[0], arr[1]));
	}

}
