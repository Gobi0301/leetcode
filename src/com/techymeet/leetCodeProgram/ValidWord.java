package com.techymeet.leetCodeProgram;

public class ValidWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String word = "234Adas";
       System.out.println(isValid(word));
	}

	private static boolean isValid(String word) {
		// TODO Auto-generated method stub
		if(word.length() < 3) {
			return false;
		}
	    int vowelCount = 0;
	    int consonantCount = 0;
	    
	    for(char c:word.toCharArray()) {
	    	if(!Character.isLetterOrDigit(c)) {
	    		return false;
	    	}
	    	if("aeiouAEIOU".indexOf(c) != -1) {
	    		vowelCount++;
	    	}
	    	else if((c>='a' && c<='z' || c>='A' && c<='z') && "aeiouAEIOU".indexOf(c) == -1) {
	    		consonantCount++;
	    	}
	    }
		return vowelCount > 0 && consonantCount>0;
	}

}
