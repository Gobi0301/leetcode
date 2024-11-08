package com.techymeet.leetCodeProgram;

public class WordsFormChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"cat","bt","hat","tree"}; 
		String chars = 	"atach";
        System.out.println(countCharacter(words,chars));
	}

	private static int countCharacter(String[] words, String chars) {
		// TODO Auto-generated method stub
		int[] count = new int[26];
		for(int i=0;i<chars.length();i++) {
			count[chars.charAt(i) - 'a']++;
		}
		int res = 0;
		for(String s:words) {
			if(canform(s,count)) {
				res+=s.length();
			}
		}
		return res;
	}

	private static boolean canform(String s, int[] count) {
		// TODO Auto-generated method stub
		int[] x = new int[26];
		for(int i=0;i<s.length();i++) {
			int val = s.charAt(i) - 'a';
			x[val]++;
			if(x[val] > count[val]) {
				return false;
			}
		}
		return true;
	}

}
