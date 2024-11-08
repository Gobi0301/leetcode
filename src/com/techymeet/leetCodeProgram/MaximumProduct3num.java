package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProduct3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<arr.length;i++) {
    	   arr[i] = sc.nextInt();
       }
       System.out.println(maxProductThreeNum(arr));
	}

	private static int maxProductThreeNum(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int n = arr.length;
		return Math.max(arr[n-1]*arr[n-2]*arr[n-3], arr[0]*arr[1]*arr[n-1]);
	}

}
