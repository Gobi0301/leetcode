package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ReplaceElementsWithRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElement(arr)));
	}

	private static int[] replaceElement(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int rightMax = -1;
		for(int i=n-1;i>=0;i--) {
			int temp = arr[i];
			arr[i] = rightMax;
			rightMax = Math.max(rightMax, temp);
		}
		return arr;
	}

}
