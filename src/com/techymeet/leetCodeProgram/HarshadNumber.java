package com.techymeet.leetCodeProgram;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x  = 23;
        System.out.println(sumOfDigitOfHarshadNumber(x));
	}

	private static int sumOfDigitOfHarshadNumber(int x) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = x;
		while(x !=0) {
			sum += x % 10;
			x /= 10;
		}
		if(num %sum == 0) {
			return sum;
		}
		return -1;
	}

}
