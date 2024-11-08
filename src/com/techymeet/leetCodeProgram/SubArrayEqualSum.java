package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubArrayEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=  sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findSubArray(arr));

	}

	private static boolean findSubArray(int[] arr) {
		// TODO Auto-generated method stub
		int n= arr.length;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<n-1;i++) {
			int sum = arr[i]+arr[i+1];
			if(!set.add(sum))
				return true;
		}
		return false;
	}

}
