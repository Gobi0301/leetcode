package com.techymeet.leetCodeProgram;

public class MaximumRepeatingSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sequence = "ababc";
		String word = "ab";
		System.out.println(maxRepeating(sequence,word));

	}

	private static int maxRepeating(String sequence, String word) {
		// TODO Auto-generated method stub
		int count =0;
		String add = word;
		while(sequence.contains(word) == true) {
			count++;
			word+=add;
		}
		return count;
	}

}
