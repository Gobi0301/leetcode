package com.techymeet.leetCodeProgram;

public class Number1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n = 11;
      System.out.println(hammingWeight(n));
	}

	private static int hammingWeight(int n) {
		// TODO Auto-generated method stub
		int res = 0;
		/*for(int i=0;i<32;i++) {
			if(((n >> i) & 1) == 1) {
				res+=1;
			}
		}*/
		while(n != 0) {
			res++;
			n = n &(n-1);
		}
		return res;
	}

}
