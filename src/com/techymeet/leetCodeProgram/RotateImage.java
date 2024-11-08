package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
	}

	private static void rotate(int[][] matrix) {
		// TODO Auto-generated method stub
		for(int k=0;k<matrix.length;k++) {
			int i = 0;
			int j = matrix.length - 1;
			while(i<j) {
				swap(matrix,i,k,j,k);
				i++;
				j--;
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=i+1;j<matrix.length;j++) {
				swap(matrix,i,j,j,i);
			}
		}
		System.out.println(Arrays.deepToString(matrix));
	}

	private static void swap(int[][] matrix, int i, int j, int k,int l) {
		// TODO Auto-generated method stub
		int temp = matrix[i][j];
		matrix[i][j] = matrix[k][l];
		matrix[k][l] = temp;
	}

}
