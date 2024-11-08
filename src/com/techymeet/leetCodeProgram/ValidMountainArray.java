package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ValidMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for(int i=0;i<arr.length;i++) {
        	  arr[i]  = sc.nextInt();
          }
          System.out.println(validArray(arr));
	}

	private static boolean validArray(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		if(len < 3) {
			return false;
		}
		
		int max = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		if(max == arr.length-1) {
			return false;
		}
		for(int i=1;i<max;i++) {
			if(arr[i] <= arr[i-1])
				return false;
		}
		for(int i=max;i<arr.length-1;i++) {
			if(arr[i] <= arr[i+1])
				return false;
		}
		return true;
	}

}
