package com.techymeet.leetCodeProgram;

public class StoneGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] piles = {10,5,9,7,4,9,8};
       int ans = stoneGame2(piles);
       System.out.println(ans);
	}

	private static int stoneGame2(int[] piles) {
		// TODO Auto-generated method stub
		int n = piles.length;
		int[][] dp = new int[n][n+1];
		int[] suffixSum = new int[n];
		suffixSum[n-1] = piles[n-1];
		for(int i=n-2;i>=0;i--) {
			suffixSum[i] = suffixSum[i+1] + piles[i];
		}
		
		for(int i=n-1;i>=0;i--) {
			for(int m=1;m<=n;m++) {
				if(i+2 * m >=n) {
					dp[i][m] = suffixSum[i];
				}else {
					for(int x=1;x<=2*m;x++) {
						dp[i][m] = Math.max(dp[i][m], suffixSum[i] - dp[i+x][Math.max(m, x)]);
					}
				}
			}
		}
		
		
		return dp[0][1];
	}

}
