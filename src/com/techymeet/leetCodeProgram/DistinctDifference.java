package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(findDistinctArray(arr,n)));

	}

	private static int[] findDistinctArray(int[] arr, int n) {
		// TODO Auto-generated method stub\
		int[] num = new int[n];
		int index = 0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			int left = 0;
			int right = 0;
			for(int j=0;j<=i;j++) {
				set.add(arr[j]);
			}
			left = set.size();
			set.clear();
			
			for(int k=i+1;k<arr.length;k++) {
				set.add(arr[k]);
			}
			right = set.size();
			set.clear();
			num[index++] = left - right;
		}
		return num;
	}

}
