package com.techymeet.leetCodeProgram;

public class GenerateStringWithCharOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 4;
        System.out.println(generateString(n));
	}

	private static String generateString(int n) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		if(n%2 == 0) {
			for(int i=0;i<n-1;i++) 
				sb.append('a');
				sb.append('b');
			
		}else {
			for(int i=0;i<n;i++) 
				sb.append('a');
			
		}
		
		return sb.toString();
	}

}
