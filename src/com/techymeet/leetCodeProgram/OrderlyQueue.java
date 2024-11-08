package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class OrderlyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cba";
		int k = 1;
		System.out.println(orderQueue(s,k));

	}

	private static String orderQueue(String s, int k) {
		// TODO Auto-generated method stub
		if(k<=1) {
			String ans = s;
			for(int i=0;i<s.length();i++) {
			String	result = s.substring(i) + s.substring(0,i);
				if(ans.compareTo(result) >0) {
					ans = result;
				}
			}
			return ans;
		}
		if(k>1) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			return new String(c);
		}
		return null;
	}

}
