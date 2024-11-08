package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class DIStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "IDID";
        System.out.println(Arrays.toString(diString(s)));
	}

	private static int[] diString(String s) {
		// TODO Auto-generated method stub
		int[] res = new int[s.length()+1];
		int min = 0;
		int max = s.length();
		int i =0;
		for(i=0;i<s.length();i++) {
			res[i] = s.charAt(i) == 'I' ? min++:max--;
		}
		res[i] = min;
		return res;
	}

}
