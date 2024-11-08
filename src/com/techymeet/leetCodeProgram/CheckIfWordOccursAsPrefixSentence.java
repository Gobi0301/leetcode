package com.techymeet.leetCodeProgram;

public class CheckIfWordOccursAsPrefixSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String sentence = "i love eating burger";
       String searchWord = "burg";
       int ans = isPrefixWord(sentence,searchWord);
       System.out.println(ans);
	}

	private static int isPrefixWord(String sentence, String searchWord) {
		// TODO Auto-generated method stub
		String[] str = sentence.split("\\s+");
		for(int i=0;i<str.length;i++) {
			if(str[i].startsWith(searchWord)) {
				return i+1;
			}
		}
		return -1;
	}

}
