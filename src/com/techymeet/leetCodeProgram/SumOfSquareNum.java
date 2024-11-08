package com.techymeet.leetCodeProgram;

public class SumOfSquareNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int c = 5;
       System.out.println(judgeSquareSum(c));
	}

	private static boolean judgeSquareSum(int c) {
		// TODO Auto-generated method stub
		long left = 0, right = (long) Math.sqrt(c);
		while(left <= right) {
			if(left * left + right * right == c) {
				return true;
			}else if(left * left + right *right > c) {
				right--;}
			else {
				left++;}
		}
		return false;
	}

}
