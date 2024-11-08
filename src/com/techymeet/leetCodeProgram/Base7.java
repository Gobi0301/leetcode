package com.techymeet.leetCodeProgram;

public class Base7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 100;
        System.out.println(convertToBase(num));
	}

	private static int convertToBase(int num) {
		// TODO Auto-generated method stub
		int base = 1;
		int ans = 0;
		while(num != 0) {
			int rem = num % 7;
			ans += base * rem;
			base *=10;
			num/=7;
		}
		return ans;
	}

}
