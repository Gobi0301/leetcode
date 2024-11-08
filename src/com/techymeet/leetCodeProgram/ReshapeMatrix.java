package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ReshapeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = {{1,2},{3,4}};
		int r = 1;
		int c = 4;
		int[][] matrix = matrixShape(mat,r,c);
		System.out.println(Arrays.deepToString(matrix));
	}

	private static int[][] matrixShape(int[][] mat, int r, int c) {
		// TODO Auto-generated method stub
		int row = mat.length;
		int col = mat[0].length;
		
		if((row * col) != (r*c)) return mat;
		
		int[][] ans = new int[r][c];
		
		int out_row = 0;
		int out_col = 0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				ans[out_row][out_col] = mat[i][j];
				out_col++;
				
				if(out_col == c) {
					out_col = 0;
					out_row++;
				}
			}
		}
		
		return ans;
	}

}
