package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(majority(arr));

	}

	private static int majority(int[] arr) {
		// TODO Auto-generated method stub
	/*	int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					sum = arr[i];
				}
			}
		}*/
		Arrays.sort(arr);
		int n = arr.length;
		return arr[n/2];
	}

}
