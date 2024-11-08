package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CanPlaceFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for(int i=0;i<arr.length;i++) {
        	  arr[i] = sc.nextInt();
          }
          int target = sc.nextInt();
          System.out.println(canPlaceFlower(arr,target));
	}

	private static boolean canPlaceFlower(int[] arr, int target) {
		// TODO Auto-generated method stub
		if(target == 0) {
			return true;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0 && (i == 0 || arr[i-1] == 0) && (i==arr.length-1 || arr[i+1]==0)) {
				arr[i] = 1;
				target--;
				if(target == 0 ) {
					return true;
				}
			}
		}
		return false;
	}

}
