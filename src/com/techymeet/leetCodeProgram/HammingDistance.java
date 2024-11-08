package com.techymeet.leetCodeProgram;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x = 1;
      int y = 4;
      System.out.println(hammingDistance(x,y));
	}

	private static int hammingDistance(int x, int y) {
		// TODO Auto-generated method stub
		int xor = x ^ y;
		int count = 0;
		while(xor !=0) {
			if(xor %2 != 0) {
				count++;
			}
			xor = xor >> 1;
		}
		return count;
	}

}
