package com.techymeet.leetCodeProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(stringToint(s));

	}

	private static int stringToint(String s) {
		// TODO Auto-generated method stub
		s = s.trim();
		StringBuilder sb = new StringBuilder();
		char[] c = s.toCharArray();
		if(s.isEmpty()) {
			return 0;
		}
		for(int i=0;i<c.length;i++) {
			if(Character.isDigit(c[i]) || (i == 0 && (c[i] == '-' || c[i] == '+'))) {
				sb.append(c[i]);
			}
			else {
				break;
			}
		}
		if(sb.length() == 0 || (sb.length() == 1 && (sb.charAt(0) == '-' || sb.charAt(0) == '+'))) {
			return 0;
		}
		BigInteger res = new BigInteger(sb.toString());
		if(res.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
			return Integer.MAX_VALUE;
		}
		else if(res.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
			return Integer.MIN_VALUE;
		}
		
		return res.intValue();
	}

}
