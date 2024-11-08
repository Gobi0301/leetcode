package com.techymeet.leetCodeProgram;

public class IncreaseDecreaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaabbbbcccc";
		System.out.println(sortString(s));

	}

	private static String sortString(String s) {
		// TODO Auto-generated method stub
		int[] arr = new int[26];
		int len = s.length();
		for(char c:s.toCharArray()) {
			arr[c -'a']++;
		}
		StringBuilder sb = new StringBuilder();
		while(len !=0) {
			for(int i=0;i<26;i++) {
				if(arr[i] >0) {
					sb.append((char) (i+'a'));
					arr[i]--;
					len--;
				}
			}
			for(int i=25;i>=0;i--) {
				if(arr[i] >0) {
					sb.append((char) (i+'a'));
					arr[i]--;
					len--;
				}
			}
		}
		
		return sb.toString();
	}

}
