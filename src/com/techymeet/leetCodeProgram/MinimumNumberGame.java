package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(findMinNum(arr)));

	}

	private static int[] findMinNum(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int length = arr.length;
		for(int i=0;i<arr.length;i+=2) {
			if(i+1 < length) {
			   int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			
		}
		return arr;
	}

}
