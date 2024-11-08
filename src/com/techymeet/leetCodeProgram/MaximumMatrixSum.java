package com.techymeet.leetCodeProgram;

public class MaximumMatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,-1},{-1,1}};
		long ans = maxMatrixSum(matrix);
		System.out.println(ans);
	}

	private static long maxMatrixSum(int[][] matrix) {
		// TODO Auto-generated method stub

		int negCount = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				int number = Math.abs(matrix[i][j]);
				if(matrix[i][j] < 0) 
					negCount++;
				 sum+=number;
				 min = Math.min(min, number);
				
			}
		}
		return negCount %2 == 0 ? sum :sum-2*min;
	}

}
