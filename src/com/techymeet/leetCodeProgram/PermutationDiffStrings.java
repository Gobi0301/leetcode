package com.techymeet.leetCodeProgram;

public class PermutationDiffStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "abcde";
		String t = "edbac";
		System.out.println(findPermutationDiff(s,t));
	}

	private static int findPermutationDiff(String s, String t) {
		// TODO Auto-generated method stub
		int sum = 0;
		int res = 0;
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c2.length;j++) {
				if(c1[i] == c2[j]) {
				sum = (i-j);
				if(sum <0) {
					sum = -(sum);
				}
				res += sum;
				}
			}
		}
		return res;
	}

}
