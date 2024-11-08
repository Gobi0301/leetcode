package com.techymeet.leetCodeProgram;

public class ZigzagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		int numRow = 3;
		System.out.println(convert(s,numRow));
	}

	private static String convert(String s, int numRow) {
		// TODO Auto-generated method stub
		if(numRow == 1 || numRow >=s.length()) {
			return s;
		}
		int len = s.length();
		String[] row = new String[numRow];
		for(int j=0;j<numRow;j++) {
			row[j] = "";
		}
		int i = 0;
		while(i<len) {
			for(int j=0;j<numRow && i<len;j++) {
				row[j] +=s.charAt(i++); 
			}
			for(int k=numRow-2;k>0 && i<len;k--) {
				row[k] += s.charAt(i++);
			}
		}
		String res = "";
		for(String rows:row) {
			res+=rows;
		}
		return res;
	}

}
