package com.techymeet.leetCodeProgram;

public class CountPrefixAndSuffixPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] words = {"a","aba","ababa","aa"};
        int res = countPrefixSuffixPairs(words);
        System.out.println(res);
	}

	private static int countPrefixSuffixPairs(String[] words) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
					count++;
				}
			}
		}
		return count;
		/*int count = 0;
		String s = "a";
		String s1 = "aba";
		if(s1.startsWith(s)) {
			count++;
		}
		return count;*/
	}

}
