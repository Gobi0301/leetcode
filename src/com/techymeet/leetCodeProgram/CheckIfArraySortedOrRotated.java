package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CheckIfArraySortedOrRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arrayRotateSort(arr));

	}

	private static boolean arrayRotateSort(int[] arr) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				count++;
			}
		}
		if(count == 0)
			return true;
		else if(count > 1)
			return false;
		else if(arr[0] >= arr[arr.length-1])
			return true;
		
		return false;
	}

}
