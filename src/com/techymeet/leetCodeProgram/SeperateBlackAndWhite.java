package com.techymeet.leetCodeProgram;

public class SeperateBlackAndWhite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "0111";
		long ans = mimumSteps(s);
		System.out.println(ans);

	}

	private static long mimumSteps(String s) {
		// TODO Auto-generated method stub
		long ans=0,count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '1') {
				count++;
			}else {
				ans+=count;
			}
		}
		return ans;
	}

}
