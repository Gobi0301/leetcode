package com.techymeet.leetCodeProgram;

public class WonderfulSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String word = "aba";
     System.out.println(wonderfulSubString(word));
	}

	private static long wonderfulSubString(String word) {
		// TODO Auto-generated method stub
		int[] count = new int[1024]; //2^10 
		count[0] = 1;
		long result = 0;
		int bitmask = 0;
		
		for(char c : word.toCharArray()) {
			int charIndex = c -'a';
			bitmask ^= 1 << charIndex;
			result += count[bitmask];
			
			for(int i=0;i<10;i++) {
				result+= count[bitmask ^ (1<<i)];
			}
			count[bitmask]++;
		}
		return result;
	}

}
