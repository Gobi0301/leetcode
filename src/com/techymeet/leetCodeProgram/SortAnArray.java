package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {5,2,3,1};
      System.out.println(Arrays.toString(sortAnArray(arr)));
	}

	private static int[] sortAnArray(int[] arr) {
		// TODO Auto-generated method stub
		
		sort(arr,arr.length-1,0);
		
		return arr;
	}

	private static void sort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i == 0) {
			return;
		}
		if(j < i) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			sort(arr,i,j+1);
		}else {
			sort(arr,i-1,0);
		}
		
	} 

}
