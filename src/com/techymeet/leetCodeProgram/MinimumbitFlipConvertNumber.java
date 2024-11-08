package com.techymeet.leetCodeProgram;

public class MinimumbitFlipConvertNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 10;
		int goal = 7;
		int ans = minBitFlip(start,goal);
		System.out.println(ans);
	}

	private static int minBitFlip(int start, int goal) {
		// TODO Auto-generated method stub
		int res = 0;
		while(start!=0 || goal !=0) {
			if((start&1) != (goal&1)) {
				res++;
			}
			start >>=1;
			goal >>=1;
		}
		return res;
	}

}
