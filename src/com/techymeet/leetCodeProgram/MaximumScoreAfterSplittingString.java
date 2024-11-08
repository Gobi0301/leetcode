package com.techymeet.leetCodeProgram;

public class MaximumScoreAfterSplittingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "011101";
        int ans = maxScore(s);
        System.out.println(ans);
	}

	private static int maxScore(String s) {
		// TODO Auto-generated method stub
		int left = -1;
		int zeros = 0;
		int ones = 0;
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) == '0') {
				zeros++;
			}else {
				ones++;
			}
			left = Math.max(left, zeros-ones);
		}
		
		if(s.charAt(s.length()-1) == '1') {
			ones+=1;
		}
		
		return left + ones;
	}

}
