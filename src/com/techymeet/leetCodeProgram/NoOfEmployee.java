package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class NoOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int result = employee(arr,target);
		System.out.println(result);

	}

	private static int employee(int[] arr, int target) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i:arr) {
			if(i >=target) {
				result++;
			}
		}
		return result;
	}

}
