package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ReverseBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	 long num = sc.nextLong();
		System.out.println(findReverseBit(num));

	}

	private static long findReverseBit(long num) {
		// TODO Auto-generated method stub
	/*	 num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);
	        num = ((num & 0xff00ff00) >>> 8) | ((num & 0x00ff00ff) << 8);
	        num = ((num & 0xf0f0f0f0) >>> 4) | ((num & 0x0f0f0f0f) << 4);
	        num = ((num & 0xcccccccc) >>> 2) | ((num & 0x33333333) << 2);
	        num = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);
	        
	        return num;*/
		int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (num & 1);
            num >>= 1;
        }
        return ans;
	}

}
