package com.techymeet.leetCodeProgram;

public class BinaryNumberAlternatingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 5;
       boolean ans = hasAlternatingBits(n);
       System.out.println(ans);
	}

	private static boolean hasAlternatingBits(int n) {
		// TODO Auto-generated method stub
		while(n!=0) {
			int lastBit = n & 1;
			int secondLastBit = (n >> 1) & 1;
			if((lastBit ^ secondLastBit) == 0)
				return false;
			
			n >>=1;
		}
		return true;
	}

}
