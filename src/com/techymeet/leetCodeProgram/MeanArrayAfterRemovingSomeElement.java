package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MeanArrayAfterRemovingSomeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
       double res = trimean(arr);
       System.out.println(res);
	}

	private static double trimean(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int n =arr.length;
		int a = n * 5/100;
		int sum = 0;
		for(int i=a;i<n-a;i++) {
			sum+=arr[i];
		}
		return (double)sum/(n-2 *a);
	}

}
