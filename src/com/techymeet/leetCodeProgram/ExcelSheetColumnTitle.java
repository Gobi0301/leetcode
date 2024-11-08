package com.techymeet.leetCodeProgram;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int columnNumber = 28;
        System.out.println(convertTotile(columnNumber));
	}

	private static String convertTotile(int columnNumber) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		while(columnNumber > 0) {
			columnNumber--;
			int ch = columnNumber % 26;
			sb.insert(0, (char) (ch + 'A'));
		    columnNumber/=26;
		}
		return sb.toString();
	}

}
