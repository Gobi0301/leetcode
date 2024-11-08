package com.techymeet.leetCodeProgram;

public class MinimumNumberChangeofmakeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "1001";
		int ans = minChanges(s);
		System.out.println(ans);

	}

	private static int minChanges(String s) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<s.length()-1;i+=2) {
			if(s.charAt(i) != s.charAt(i+1)) {
				count++;
			}
		}
		return count;
	}

}
