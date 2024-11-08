package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class Convert1DArrayto2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4};
		int m = 2;
		int n = 2;
		int[][] ans = construct2Array(original,m,n);
		System.out.println(Arrays.deepToString(ans));
	}

	private static int[][] construct2Array(int[] original, int m, int n) {
		// TODO Auto-generated method stub
		if(m*n != original.length) {
			return new int[0][0];
		}
		int[][] res = new int[m][n];
		for(int i=0;i<m*n;i++) {
			res[i/n][i%n] = original[i];
		}
		return res;
	}

}
