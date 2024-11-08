package com.techymeet.leetCodeProgram;

public class FactorialTrailingZero {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 5;
        System.out.println(trailingZero(n));
	}
	private static int trailingZero(int n) {
		// TODO Auto-generated method stub
		return n == 0 ? 0 : n/5 + trailingZero(n/5);
	}

}
