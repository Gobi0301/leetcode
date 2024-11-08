package com.techymeet.leetCodeProgram;

public class CustomSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String order = "bcafg";
        String s = "abcd";
        System.out.println(customSortString(order,s));
	}

	private static String customSortString(String order, String s) {
		// TODO Auto-generated method stub
		int[] freq = new int[26];
		for(char c:s.toCharArray()) {
			freq[c-'a']++;
		}
		StringBuilder sb =new StringBuilder();
		for(char c:order.toCharArray()) {
			while(freq[c-'a'] >0) {
				sb.append(c);
				freq[c-'a']--;
			}
		}
		for(int i=0;i<26;i++) {
			while(freq[i] >0) {
				sb.append(Character.toString((char) (i+'a')));
				freq[i]--;
			}
		}
		return sb.toString();
	}

}
