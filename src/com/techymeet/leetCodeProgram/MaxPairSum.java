package com.techymeet.leetCodeProgram;

public class MaxPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {51,71,17,24,42};
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum = arr[i] + arr[j];
				if(sum > max) {
					max = sum;
				}
			}
		}

	}

}
