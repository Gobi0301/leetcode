package com.techymeet.leetCodeProgram;

public class MinimumCutstoDivideCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 4;
        System.out.println(numberOfCuts(n));
	}

	private static int numberOfCuts(int n) {
		// TODO Auto-generated method stub
		if(n == 1)
			return 0;
		if(n %2 == 0)
			return n/2;
		return n;
	}

}
