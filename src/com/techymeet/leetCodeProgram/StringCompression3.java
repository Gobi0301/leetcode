package com.techymeet.leetCodeProgram;

public class StringCompression3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "abcde";
		String ans = compressedString(word);
		System.out.println(ans);
	}

	private static String compressedString(String word) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int cnt = 1, n=word.length();
		char c = word.charAt(0);
		for(int i=1;i<n;i++) {
			if(word.charAt(i) == c && cnt < 9) {
				cnt++;
			}else {
				sb.append(cnt).append(c);
				c = word.charAt(i);
				cnt = 1;
			}
		}
		sb.append(cnt).append(c);
		return sb.toString();
	}

}
