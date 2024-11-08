package com.techymeet.leetCodeProgram;

public class ToeplitzMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		boolean ans = isToeplitzMatrix(matrix);
		System.out.println(ans);
	}

	private static boolean isToeplitzMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		for(int i=0;i<matrix.length;i++) {
			if(!check(matrix,i,0)) {
				return false;
			}
		}
		for(int i=0;i<matrix[0].length;i++) {
			if(!check(matrix,0,i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean check(int[][] matrix, int row, int col) {
		// TODO Auto-generated method stub
		int val = matrix[row][col];
		while(row !=matrix.length && col!=matrix[0].length) {
			if(val != matrix[row][col]) {
				return false;
			}else {
				row++;
				col++;
			}
		}	
		return true;
	}

}
