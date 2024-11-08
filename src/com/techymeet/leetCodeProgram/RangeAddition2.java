package com.techymeet.leetCodeProgram;

public class RangeAddition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 3;
		int n = 3;
		int[][] ops = {{2,2},{3,3}};
		int ans = maxCount(m,n,ops);
		System.out.println(ans);
	}

	private static int maxCount(int m, int n, int[][] ops) {
		// TODO Auto-generated method stub
		if(ops.length == 0) {
			return m*n;
		}
		int minRow = Integer.MAX_VALUE;
		int minCol = Integer.MAX_VALUE;
		for(int[] grid:ops) {
			minRow = Math.min(minRow, grid[0]);
			minCol = Math.min(minCol, grid[1]);
		}
		return minRow * minCol;
	}

}
