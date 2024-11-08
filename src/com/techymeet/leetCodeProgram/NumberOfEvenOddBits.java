package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class NumberOfEvenOddBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 50;
		int[] ans = evenOddBit(n);
		System.out.println(Arrays.toString(ans));

	}

	private static int[] evenOddBit(int n) {
		// TODO Auto-generated method stub
		int odd = 0;
		int even = 0;
		int index = 0;
		while(n != 0) {
			if(index%2 == 0) {
				if((n&1) == 1) {
					even++;
				}
			}else {
				if((n&1) == 1) {
					odd++;
				}
			}
			index++;
			n >>=1;
		}
		return new int[] {even,odd};
	}

}
