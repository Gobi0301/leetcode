package com.techymeet.leetCodeProgram;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n = (int) Long.parseUnsignedLong("00000010100101000001111010011100");
		System.out.println(reverse(n));
		
	}

	private static int reverse(int n) {
		// TODO Auto-generated method stub
		int ans = 0;
		for(int i=0;i<32;i++) {
			ans <<= 1;
			ans |= (n & 1);
			n >>= 1;
		}
		return ans;
	}

}
