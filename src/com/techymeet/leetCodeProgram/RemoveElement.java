package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(removeElement(arr,target));

	}

	private static int removeElement(int[] arr, int target) {
		// TODO Auto-generated method stub
		//int count = 0;
		Arrays.sort(arr);
		//int[] num = new int[arr.length];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != target) {
				arr[index] = arr[i];
				index++;
				
			}
		}
		/*for(int i=0;i<num.length;i++) {
			if(num[i] != 0) {
				count++;
			}
		}*/
		return index;
		
	}

}
