package com.techymeet.leetCodeProgram;

import java.util.ArrayList;

public class SortCharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "tree";
       System.out.println(findCharacterFrequency(s));
	}

	class Pair implements Comparable<Pair>{
		char ch;
		int freq;
		Pair(char ch,int freq){
			this.ch = ch;
			this.freq = freq;
		}
		@Override
		public int compareTo(Pair p) {
			// TODO Auto-generated method stub
			return p.freq - this.freq; 
		}
		
	}
	private static String findCharacterFrequency(String s) {
		// TODO Auto-generated method stub
		int[] arr = new int[123];  //ASCII of z -> 122
		for(char c:s.toCharArray()) {
			arr[c]++;
		}
		ArrayList<Pair> list = new ArrayList<>();
		// ASCII of '0' starts from 48
		for(int i=48;i<123;i++) {
			if(arr[i] > 0) {
				 //list.add(new Pair((char)i, arr[i]));
			}
		}
		
		return null;
	}

}
