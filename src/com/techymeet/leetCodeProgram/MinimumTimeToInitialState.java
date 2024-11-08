package com.techymeet.leetCodeProgram;

public class MinimumTimeToInitialState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String word = "abacaba";
       int k = 3;
       int res = minimumTimeIntialState(word,k);
       System.out.println(res);
	}

	private static int minimumTimeIntialState(String word, int k) {
		// TODO Auto-generated method stub
		int res = 0;
		String str = new String(word);
		do {
			res++;
			if(str.length()<k)
				return res;
			str = str.substring(k);
		}while(!check(str,word));
		return res;
	}

	private static boolean check(String str, String word) {
		// TODO Auto-generated method stub
		int m = str.length();
		for(int i=0;i<m;i++) {
			if(str.charAt(i) != word.charAt(i))
				return false;
		}
		return true;
	} 

}
