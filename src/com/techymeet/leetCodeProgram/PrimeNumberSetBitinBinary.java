package com.techymeet.leetCodeProgram;

public class PrimeNumberSetBitinBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int left = 6;
		int right = 10;
		int ans = countPrime(left,right);
		System.out.println(ans);
	}

	private static int countPrime(int left, int right) {
		// TODO Auto-generated method stub
		int res = 0;
		for(int i=left;i<=right;i++) {
			if(isCount(i)) {
				res++;
			}
		}
		return res;
	}

	private static boolean isCount(int i) {
		// TODO Auto-generated method stub
		int count = 0;	
		while(i != 0) {
			i = i &(i-1);
			count++;
		}
	//	return count;
		return isPrime(count);
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num<=1) {
			return false;
		}
		if(num<=3) {
			return true;
		}
		if(num%2 == 0 || num %3 == 0) {
			return false;
		}
		for(int i=5;i*i<=num;i+=6) {
			if(num%i == 0 || num %(i+2) == 0) {
				return false;
			}
		}
		return true;
	}

}
