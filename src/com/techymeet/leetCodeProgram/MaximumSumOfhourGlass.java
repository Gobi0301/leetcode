package com.techymeet.leetCodeProgram;

public class MaximumSumOfhourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] gird = {{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};
		int ans = maximumSumOfGlass(gird);
		System.out.println(ans);
	}

	private static int maximumSumOfGlass(int[][] grid) {
		// TODO Auto-generated method stub
		int row = grid.length-1;
		int col = grid[0].length-1;
		int max = Integer.MIN_VALUE;
		
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				int sum =grid[i][j] + grid[i-1][j] + grid[i+1][j] + grid[i-1][j-1] + grid[i-1][j+1] + grid[i+1][j-1] + grid[i+1][j+1] ;
				max = Math.max(sum, max);
			}
			
		}
		return max;
	}

}
