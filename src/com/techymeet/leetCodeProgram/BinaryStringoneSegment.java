package com.techymeet.leetCodeProgram;

public class BinaryStringoneSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "1001";
      System.out.println(checkOnes(s));
	}

	private static boolean checkOnes(String s) {
		// TODO Auto-generated method stub
		char[] c = s.toCharArray();
		for(int i=0;i<s.length()-1;i++) {
			if(c[i+1] == '1' && c[i] == '0') {
				return false;
			}
		}
		return true;
	}

}
