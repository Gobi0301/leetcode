package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class MaximumNoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		String[] str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
       /* for(int i=0;i<str.length;i++) {
        	str[i] = sc.next();
        }*/
        int count = mostWords(str);
        System.out.println(count);
	}

	private static int mostWords(String[] str) {
		// TODO Auto-generated method stub
		int maxWord  = 0;
		for(String s : str) {
			String[] word = s.split(" ");
			int numWord = word.length;
			if(numWord > maxWord) {
				maxWord = numWord;
			}
		}
		return maxWord;
	}

}
