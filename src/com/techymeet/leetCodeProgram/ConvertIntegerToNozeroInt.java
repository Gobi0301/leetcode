package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ConvertIntegerToNozeroInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 1010;
        System.out.println(Arrays.toString(getNoInteger(n)));
	}
	
	public static boolean check(int n) {
		while(n > 0) {
			if(n % 10 == 0) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

	private static int[] getNoInteger(int n) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = n-1;
	   while(!check(a) || !check(b)) {
		   a = a+1;
		   b = b-1;
	   }
		return new int[] {a,b};
	}

}
