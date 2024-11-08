package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class LargestLocalValueMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
		System.out.println(Arrays.deepToString(largestLocal(grid)));

	}

	private static int[][] largestLocal(int[][] grid) {
		// TODO Auto-generated method stub
		int n = grid.length;
		int[][] maxLocal = new int[n-2][n-2];
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<n-2;j++) {
				maxLocal[i][j] = findMax(grid,i,j);
			}
		}
		return maxLocal;
	}

	private static int findMax(int[][] grid, int x, int y) {
		// TODO Auto-generated method stub
		int maxEle = 0;
		for(int i=x;i<x+3;i++) {
			for(int j=y;j<y+3;j++) {
				maxEle = Math.max(maxEle, grid[i][j]);
			}
		}
		return maxEle;
	}

}
