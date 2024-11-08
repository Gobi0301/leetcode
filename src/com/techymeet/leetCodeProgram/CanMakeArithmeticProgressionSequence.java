package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class CanMakeArithmeticProgressionSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {3,5,1};
        boolean res = canMakeArithmeticProgress(arr);
        System.out.println(res);
	}

	private static boolean canMakeArithmeticProgress(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int d = arr[1] -arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] - arr[i-1] != d) {
				return false;
			}
		}
		return true;
	}

}
