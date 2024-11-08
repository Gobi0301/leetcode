package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class NumberFacinating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findfascinating(n));

	}

	private static boolean findfascinating(int n) {
		// TODO Auto-generated method stub
		String num1 = Integer.toString(n);
		String num2 = Integer.toString(2*n);
		String num3 = Integer.toString(3*n);
		String ans = num1+num2+num3;
	    char[] c = ans.toCharArray();
	    Arrays.sort(c);
	    int count = 1;
	    int res = 0;
	    for(int i=1;i<c.length+1;i++) {
	    	if(Character.getNumericValue(c[i-1]) == count++) {
	    		res++;
	    	}
	    }
	if(res>=c.length) {
		return true;
	}
		
		return false;
	}

}
