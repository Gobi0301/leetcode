package com.techymeet.leetCodeProgram;

public class MaximumValueOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] str = {"alic3","bob","3","4","00000"};
       System.out.println(maximumValue(str));
	}

	private static int maximumValue(String[] str) {
		// TODO Auto-generated method stub
		int res = 0;
		
		for(String s:str) {
			boolean isNumeric = true;
			
			for(int i=0;i<s.length();i++) {
				if(!Character.isDigit(s.charAt(i))) {
					isNumeric = false;
					break;
				}
			}
			
			res = Math.max(res, isNumeric ? Integer.parseInt(s) : s.length());
			
		}
		
		return res;
	}

}
