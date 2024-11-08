package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MaximumOddBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "0101";
       System.out.println(maxBinaryNum(s));
	}

	private static String maxBinaryNum(String s) {
		// TODO Auto-generated method stub
	int countOne = 0;
	StringBuilder sb = new StringBuilder();
	for(char c:s.toCharArray()) {
		if(c == '1') {
			countOne++;
		}
	}
	for(int i=0;i<s.length()-1;i++) {
		if(countOne > 1) {
			countOne--;
			sb.append('1');
		}
		else {
			sb.append('0');
		}
	}
	sb.append('1');
		return sb.toString();
	}

}
