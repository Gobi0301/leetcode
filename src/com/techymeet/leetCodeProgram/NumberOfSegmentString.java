package com.techymeet.leetCodeProgram;

public class NumberOfSegmentString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello, my name is John";
		int ans = countSegment(s);
		System.out.println(ans);

	}

	private static int countSegment(String s) {
		// TODO Auto-generated method stub
		String[] str = s.split("\\s+");
		int count = 0;
		for(int i=0;i<str.length;i++) {
			count++;
		}
		
		return count;
	}

}
