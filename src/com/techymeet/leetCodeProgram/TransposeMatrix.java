package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
     int[][] ans = transpose(matrix);
     System.out.println(Arrays.deepToString(ans));
	}

	private static int[][] transpose(int[][] matrix) {
		// TODO Auto-generated method stub
		int[][] ans = new int[matrix[0].length][matrix.length];
		for(int j=0;j<matrix[0].length;j++) {
			for(int i=0;i<matrix.length;i++) {
				ans[j][i] = matrix[i][j];
			}
		}
		return ans;
	}

}
