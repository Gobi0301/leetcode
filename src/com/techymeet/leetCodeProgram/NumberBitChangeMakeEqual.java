package com.techymeet.leetCodeProgram;

public class NumberBitChangeMakeEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 13;
		int k  = 4;
		int ans = minchange(n,k);
		System.out.println(ans);
	}

	private static int minchange(int n, int k) {
		// TODO Auto-generated method stub
		k ^=n;
		int cnt = Integer.bitCount(k);
		k &=n;
		return cnt == Integer.bitCount(k) ? cnt:-1;
	}

}
