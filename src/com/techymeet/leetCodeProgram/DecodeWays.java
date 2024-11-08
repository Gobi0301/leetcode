package com.techymeet.leetCodeProgram;

public class DecodeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "121";
     System.out.println(numDecoding(s));
	}

	private static int numDecoding(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		if(n == 0 || s.charAt(0) == '0') {
			return 0;
		}
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i=2;i<=n;i++) {
			if(s.charAt(i-1) != '0') {
				dp[i] += dp[i-1];
			}
			int twoDigit = Integer.parseInt(s.substring(i-2,i));
			
			if(twoDigit >= 10 && twoDigit <=26) {
				dp[i] += dp[i-2];
			}
		}
		return dp[n];
	}

}
