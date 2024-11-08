package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
int[] result = smallNumbersThanCurrent(arr);
System.out.println(Arrays.toString(result));
	}

	private static int[] smallNumbersThanCurrent(int[] arr) {
		int count=0;
		// TODO Auto-generated method stub
		int[] result = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j] != arr[i] && arr[j] < arr[i])
					count++;
			}
			result[i] = count;
			count = 0;
			
		}
		
		return result;
	}

}
