package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class LongestAlternatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	System.out.println(longAlternateArray(arr));

	}

	private static int longAlternateArray(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length,res=-1,dp=-1;
		for(int i=1;i<n;++i,res=Math.max(res, dp)) {
			if(dp > 0 && arr[i] == arr[i-2])
				dp++;
			else
				dp = arr[i] == arr[i-1] + 1 ? 2:-1;
		}
		return res;
	}

}
