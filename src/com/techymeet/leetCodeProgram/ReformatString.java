package com.techymeet.leetCodeProgram;

public class ReformatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "a0b1c2";
       String ans = reformat(s);
       System.out.println(ans);
	}

	private static String reformat(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		char[] digit = new char[n];
		char[] letter = new char[n];
		int letterIndex = 0;
		int digitIndex = 0;
		
		for(int i=0;i<n;i++) {
			if(Character.isDigit(s.charAt(i))) {
				digit[digitIndex++] = s.charAt(i);
			}else {
				letter[letterIndex++] = s.charAt(i);
			}
		}
		
		if(Math.abs(digitIndex - letterIndex) > 1){
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		
		if(digitIndex >= letterIndex) {
			for(int i=0;i<letterIndex;i++) {
				sb.append(digit[i]);
				sb.append(letter[i]);
			}
			
			if(digitIndex >letterIndex) {
				sb.append(digit[digitIndex-1]);
			}
		}else {
			for(int i=0;i<digitIndex;i++) {
				sb.append(letter[i]);
				sb.append(digit[i]);
			}
			sb.append(letter[letterIndex-1]);
		}
		
		return sb.toString();
	}

}
