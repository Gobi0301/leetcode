package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SeperateDigitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = sepearteDigit(arr);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] sepearteDigit(int[] arr) {
		// TODO Auto-generated method stub
		/* int[] nums = new int[arr.length];
		
		 for(int i=0;i<arr.length;i++) {
			 nums[i] = arr[i] % 10;
			 arr[i] /= 10;
		 }
		return nums;*/
		int len = 0;
		for(int arrs:arr) {
			while(arrs > 0) {
				arrs /= 10;
				len++;
			}
		}
		int[] res = new int[len];
		int index = len - 1;
		for(int i=arr.length-1;i>=0;i--) {
			int arrs = arr[i];
			while(arrs > 0) {
				res[index--] = arrs%10;
				arrs /= 10;
			}
		}
		
		return res;
	}

}
