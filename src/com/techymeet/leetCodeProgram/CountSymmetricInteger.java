package com.techymeet.leetCodeProgram;

public class CountSymmetricInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int low = 1200;
      int high = 1230;
      System.out.println(countSymmetricInt(low,high));
	}

	private static int countSymmetricInt(int low, int high) {
		// TODO Auto-generated method stub
		int res = 0;
		for(int i=low;i<=high;i++) {
			if(Symmetric(i)) {
				res++;
			}
		}
		return res;
	}

	private static boolean Symmetric(int num) {
		// TODO Auto-generated method stub
		String s = Integer.toString(num);
		int n = s.length();
		if(n % 2 == 1) {
			return false;
		}
		
		int leftSum = 0;
		int rightSum = 0;
		for(int i=0;i<n/2;i++) {
			leftSum+= s.charAt(i) - '0';
			rightSum += s.charAt(n-i-1) - '0';
		}
		
		return leftSum == rightSum;
	}

}
