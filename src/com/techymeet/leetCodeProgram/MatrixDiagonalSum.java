package com.techymeet.leetCodeProgram;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(diagonalSum(mat));
	}

	private static int diagonalSum(int[][] mat) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(i==j || (i+j) == mat.length-1) {
					sum+=mat[i][j];
				}
			}
		}
		return sum;
	}

}
