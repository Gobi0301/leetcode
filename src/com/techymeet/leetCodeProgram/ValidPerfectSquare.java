package com.techymeet.leetCodeProgram;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = 14;
       System.out.println(isPerfect(num));
	}

	private static boolean isPerfect(int num) {
		// TODO Auto-generated method stub
	
		long  l = 1,r = num;
		while(l<=r) {
			long mid = l + (r-l)/2;
			if(mid * mid == num) {
				return true;
			}else if(mid * mid > num) {
				r = mid -1;
			}else {
				l = mid +1;
			}
		}
		return false;
	}

}
