package com.techymeet.leetCodeProgram;

public class BitwiseAndOfNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int left = 5;
		int right = 7;
		int ans = rangeBitWiseAnd(left,right);
		System.out.println(ans);
	}

	private static int rangeBitWiseAnd(int left, int right) {
		// TODO Auto-generated method stub
		int count = 0;
		while(left != right) {
			left >>= 1;
			right >>=1;
			count++;
		}
		return (left << count);
	}

}
