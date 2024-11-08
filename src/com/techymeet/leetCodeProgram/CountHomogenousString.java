package com.techymeet.leetCodeProgram;

public class CountHomogenousString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcccaa";
		System.out.println(countHomogenous(s));

	}

	private static int countHomogenous(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		long res = 0;
		for(int j=0;j<s.length();j++) {
			if(s.charAt(i) == s.charAt(j)) {
				res += j-i+1;
			}else {
				res+=1;
				i=j;
			}
		}
		return (int) (res %(1000000007));
	}

}
