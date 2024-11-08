package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class MinimumSizeSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(minSizeSubArray(arr,target));

	}

	private static int minSizeSubArray(int[] arr,int target) {
		// TODO Auto-generated method stub
		int ans = Integer.MAX_VALUE;
		int left = 0;
		int right = 0;
		int sum = 0;
		while(right<arr.length) {
			sum +=arr[right];
			while(sum>=target) {
				int len = right -left +1;
				if(len < ans) {
					ans = len;
				}
				sum -=arr[left];
				left++;
			}
			right++;
		}
		if(ans == Integer.MAX_VALUE) {
			ans = 0;
		}
		return ans;
	}

}
