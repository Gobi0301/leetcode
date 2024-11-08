package com.techymeet.leetCodeProgram;

public class AlternateDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 521;
        System.out.println(alternateDigitSum(n));
	}

	private static int alternateDigitSum(int n) {
		// TODO Auto-generated method stub
		int size = 0;
		int sumOdd = 0;
		int sumEven = 0;
		boolean flag = true;
		while(n >0) {
			int rem = n % 10;
			if(flag) {
				sumOdd+=rem;
				sumEven -= rem;
			}
			else {
				sumOdd -= rem;
				sumEven += rem;
			}
			flag = !flag;
			size++;
			n/=10;
		}
		if(size % 2 == 1) {
			return sumOdd;
		}
		return sumEven;
	}

}
