package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(smallRange(arr,k));

	}

	private static int smallRange(int[] arr, int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		if(arr.length == 1) {
			return 0;
		}
		int a =arr[0] + k;
		int b = arr[arr.length-1] - k;
		int ans = b -a;
		if(ans < 0) {
			ans = 0;
		}
		return ans;
	}

}
