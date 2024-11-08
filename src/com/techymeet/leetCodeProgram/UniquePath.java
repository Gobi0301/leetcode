package com.techymeet.leetCodeProgram;

public class UniquePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
	    int n = 7;
        System.out.println(uniquePaths(m,n));
	}

	private static int uniquePaths(int m, int n) {
		// TODO Auto-generated method stub
		int[][] dp = new int[m][n];
		return findPath(0,0,m,n,dp);
	}

	private static int findPath(int path1, int path2, int m, int n, int[][] dp) {
		// TODO Auto-generated method stub
		if(path1+1 == m && path2+1 == n) {
			return 1;
		}
		if(path1 == m) {
			return 0;
		}
		if(path2 == n) {
			return 0;
		}
		if(dp[path1][path2] != 0) {
			return dp[path1][path2];
		}
		dp[path1][path2] = findPath(path1+1,path2,m,n,dp) + findPath(path1,path2+1,m,n,dp);
		return dp[path1][path2];
	}

}
