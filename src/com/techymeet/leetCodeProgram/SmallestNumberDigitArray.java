package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class SmallestNumberDigitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {3,5,2,6};
		int[] num2 = {3,1,7};
		System.out.println(findMinNum(num1,num2));

	}

	private static int findMinNum(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
	   Arrays.sort(num1);
	   Arrays.sort(num2);
	   for(int i=0;i<num1.length;i++) {
		   for(int j=0;j<num2.length;j++) {
			   if(num1[i] == num2[j])
				   return num1[i];
		   }
	   }
	   int min = Math.min(num1[0], num2[0]);
	   int max = Math.max(num1[0], num2[0]);
		return (min*10 + max);
	}

}
