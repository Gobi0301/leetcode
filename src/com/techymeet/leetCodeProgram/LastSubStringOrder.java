package com.techymeet.leetCodeProgram;


public class LastSubStringOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cacacb";
      System.out.println(lastSubString(s));
	}

	private static String lastSubString(String s) {
		// TODO Auto-generated method stub
		int maxIndex = s.length()-1;
		for(int currIndex=s.length()-1;currIndex>=0;currIndex--) {
			if(s.charAt(currIndex) >s.charAt(maxIndex)) {
				maxIndex  = currIndex;
			}
			else if(s.charAt(currIndex) == s.charAt(maxIndex)) {
				int i = currIndex+1;
				int j = maxIndex+1;
				
				while(i<maxIndex && j<s.length() && s.charAt(i) == s.charAt(j)) {
					i++;
					j++;
				}
				if(i==maxIndex || j==s.length() || s.charAt(i) > s.charAt(j)) {
					maxIndex = currIndex;
				}
			}
			
		}
		return s.substring(maxIndex);
	}

}
