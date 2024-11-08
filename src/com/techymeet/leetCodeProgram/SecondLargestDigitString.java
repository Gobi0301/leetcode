package com.techymeet.leetCodeProgram;

public class SecondLargestDigitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "dfa12321afd";
        System.out.println(secondHighest(s));
	}

	private static int secondHighest(String s) {/*
		// TODO Auto-generated method stub
	    int a = -1;
	    int b = -1;
	    for(char c:s.toCharArray()) {
	    	if(Character.isDigit(c)) {
	    		int x = Character.getNumericValue(c);
	    		
	    		if(x > a) {
	    			b = a;
	    			a = x;
	    		}else if(x != a && x>b) {
	    			b = x;
	    		}
	    	}
	    }
	    return b;
	*/
		int c = 0;
    for(char ch='9'; ch>='0'; ch--){
        if(s.indexOf(ch) != -1) 
        	c++;
        if(c == 2) 
        	return ch - '0';
    }
    return -1;
		}

}
