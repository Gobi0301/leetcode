package com.techymeet.leetCodeProgram;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  ="AB";
		System.out.println(findtitleNum(s));

	}

	private static int findtitleNum(String s) {
		// TODO Auto-generated method stub
		int sum = 0;
		if(s  == null) {
			return -1;
		}
		for(char c:s.toUpperCase().toCharArray()) {
			sum *= 26;
			sum += c -'A' +1;
		}
		return sum;
	}

}
