package com.techymeet.leetCodeProgram;

public class ShortestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aacecaaa";
		String ans = shortestPalindrome(s);
		System.out.println(ans);
	}

	private static String shortestPalindrome(String s) {
		// TODO Auto-generated method stub
		int count = kmp(new StringBuilder(s).reverse().toString(),s);
		return new StringBuilder(s.substring(count)).reverse().toString() + s;
	}

	private static int kmp(String txt, String pattern) {
		// TODO Auto-generated method stub
		String str = pattern + "#" + txt;
		int[] pi = new int[str.length()];
		int i = 1,k=0;
		while(i<str.length()) {
			if(str.charAt(i) == str.charAt(k)) {
				k++;
				pi[i] = k;
				i++;
			}else {
				if(k>0) {
					k = pi[k-1];
				}else {
					pi[i] = 0;
					i++;
				}
			}
		}
		return pi[str.length()-1];
	}

}
