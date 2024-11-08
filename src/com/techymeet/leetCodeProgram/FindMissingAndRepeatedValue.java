package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class FindMissingAndRepeatedValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] gird = {{1,3},{2,2}};
       System.out.println(Arrays.toString(missingRepeatedValue(gird)));
	}

	private static int[] missingRepeatedValue(int[][] gird) {
		// TODO Auto-generated method stub
		int n = gird.length;
		int m = n*n;
		int[] numbers = new int[n*n];
		int[] ans = new int[2];
		int k = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				numbers[k++] = gird[i][j];
			}
		}
		
		Arrays.sort(numbers);
		
		if(numbers[0] != 1) {
			ans[1]  = 1;
		}
		
		if(numbers[m-1] != m) {
			ans[1] = m;
		}
		
		for(int i=1;i<m;i++) {
			if(numbers[i] == numbers[i-1]) {
				ans[0] = numbers[i];
			}
			if(numbers[i] - numbers[i-1] == 2) {
				ans[i]  = (numbers[i] + numbers[i-1]) / 2;
			}
		}
		
		return ans;
	} 

}
