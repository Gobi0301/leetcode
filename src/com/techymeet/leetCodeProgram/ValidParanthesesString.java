package com.techymeet.leetCodeProgram;

public class ValidParanthesesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "(*))";
        System.out.println(checkValidString(s));
	}

	private static boolean checkValidString(String s) {
		// TODO Auto-generated method stub
		int leftMax =0,leftMin=0;
		for(char c:s.toCharArray()) {
			if(c == '(') {
				leftMax++;
				leftMin++;
			}else if(c == ')') {
				leftMax--;
				leftMin-- ;
			}
			else {
				leftMin--;
				leftMax++;
			}
			if(leftMax < 0) {
				return false;
			}
			if(leftMin < 0) {
				leftMin = 0;
			}
		}
		return leftMin == 0;
	}

}
