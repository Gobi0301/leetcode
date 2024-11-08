package com.techymeet.leetCodeProgram;

public class TwoKeysKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 24;
		int ans = minSteps(n);
		System.out.println(ans);
	}

	private static int minSteps(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
		}
		int factor = 2;
		int steps = 0;
		while( n > 1) {
			while(n % factor == 0) {
				steps+= factor;
				n/=factor;
			}
			factor++;
		}
		return steps;
	}

}
