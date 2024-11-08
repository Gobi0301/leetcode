package com.techymeet.leetCodeProgram;

public class ModifyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] matrix = {{1,2,-1},{4,-1,6},{7,8,9}};
       System.out.println(modifiedmatrix(matrix));
	}

	private static int[][] modifiedmatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		int[] max = new int[matrix[0].length];
		for(int j=0;j<matrix[0].length;j++) {
			for(int i=0;i<matrix.length;i++) {
				max[j] = Math.max(max[j], matrix[i][j]);
			}
		}
		
		for(int row=0;row<matrix.length;row++) {
			for(int col=0;col<matrix[0].length;col++) {
				if(matrix[row][col] == -1) {
					matrix[row][col] = max[col];
				}
			}
		}
		
		return matrix;
	}

}
