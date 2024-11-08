package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = sortedArray(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] sortedArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i] * arr[i];
		}
		Arrays.sort(arr);
		return arr;
	}

}
