package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class NumberOfLinesWriteString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String s = "abcdefghijklmnopqrstuvwxyz";
		
		int[] ans = numberOfLines(widths,s);
		System.out.println(Arrays.toString(ans));

	}

	private static int[] numberOfLines(int[] widths, String s) {
		// TODO Auto-generated method stub
		int sum=0,lines =1;
		for(char c:s.toCharArray()) {
			int idx = c - 'a';
			if(sum + widths[idx] > 100) {
				lines++;
				sum = 0;
			}
			sum += widths[idx];
		}
		return new int[] {lines,sum};
	}

}
