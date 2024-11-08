package com.techymeet.leetCodeProgram;

public class MinimumSumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] gird = {{1,3,1},{1,5,1},{4,2,1}};
		int ans = minPath(gird);
		System.out.println(ans);

	}

	private static int minPath(int[][] gird) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<gird.length;i++) {
			for(int j=0;j<gird[0].length;j++) {
				sum+=gird[i][j];
			}
		}
		return sum;
	}

}
