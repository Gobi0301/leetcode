package com.techymeet.leetCodeProgram;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n  = 22;
		int ans = binaryGap(n);
		System.out.println(ans);
	}

	private static int binaryGap(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		int max = 0;
		while(n > 0) {
			if((n&1)==1) {
				max = Math.max(max, count);
				count = 1;
			}else if(count > 0) {
				count++;
			}
			n >>=1;
		}
		return max;
	}

}
