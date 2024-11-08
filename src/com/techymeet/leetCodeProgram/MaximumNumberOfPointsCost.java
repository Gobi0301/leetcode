package com.techymeet.leetCodeProgram;

public class MaximumNumberOfPointsCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] points = {{1,2,3},{1,5,1},{3,1,1}};
		long ans  = maxPoints(points);
		System.out.println(ans);
		
	}

	private static long maxPoints(int[][] points) {
		// TODO Auto-generated method stub
		int row = points.length;
		int col = points[0].length;
		
		long[] dp = new long[col];
		
		for(int i=0;i<col;++i) {
			dp[i] = points[0][i];
		}
		
		for(int i=1;i<row;++i) {
			long[] leftMax = new long[col];
			long[] rightMax = new long[col];
			long[] dpnew = new long[col];
			
			leftMax[0] = dp[0];
			for(int j=1;j<col;++j) {
				leftMax[j] = Math.max(leftMax[j-1], dp[j]+j);
			} 
			
			rightMax[col-1] = dp[col-1] - (col-1);
			for(int j=col-2;j>=0;j--) {
				rightMax[j] = Math.max(rightMax[j+1], dp[j]-j);
			}
			for(int j=0;j<col;++j) {
				dpnew[j] = Math.max(leftMax[j]-j, rightMax[j]+j) + points[i][j];
			}
			
			dp = dpnew;
		}
		long maxPoints = dp[0];
		for(int j=1;j<col;++j) {
			maxPoints = Math.max(maxPoints, dp[j]);
		}
		
		return maxPoints;
	}

}
