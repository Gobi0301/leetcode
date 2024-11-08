package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MaximumNumberString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"cd","ac","dc","ca","zz"};
		System.out.println(findMaximum(words));
	}

	private static int findMaximum(String[] words) {
		// TODO Auto-generated method stub
	int count = 0;
	for(int i=0;i<words.length;i++) {
		for(int j=i+1;j<words.length;j++) {
			if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
				count++;
			}
		}
	}
		return count;
	}

}
