package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num1 = new int[n];
		int[] num2 = new int[m];
		for(int i=0;i<num1.length;i++) {
			num1[i] = sc.nextInt();
		}
		for(int i=0;i<num2.length;i++) {
			num2[i] = sc.nextInt();
		}
		System.out.println(findMedianSortedArray(num1,num2));

	}

	private static double findMedianSortedArray(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		int n = num1.length;
		int m = num2.length;
	  
		int[] merged = new int[m+n];
		int k = 0;
		for(int i=0;i<n;i++) {
			merged[k++] = num1[i];
		}
		for(int i=0;i<m;i++) {
			merged[k++] = num2[i];
		}
		
		Arrays.sort(merged);
		
		int total = merged.length;
		if(total %2 == 1) {
			return (double) merged[total/2];
		}
		else {
			int middle1 = merged[total/2-1];
			int middle2 = merged[total/2];
			return ((double) middle1 + (double) middle2) / 2.0;
		}
		
		
		
	}

}
