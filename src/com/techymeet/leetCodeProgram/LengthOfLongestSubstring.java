package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//System.out.println(lenOflongestSubString(s));
		lenOflongestSubString(s);
	}

	private static void lenOflongestSubString(String s) {
		// TODO Auto-generated method stub
		Set<Character> set = new HashSet<Character>();
	//	int maxLen = 0;
		int j=0;
		for(int i=0;i<s.length();i++) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
			//	maxLen = Math.max(maxLen, i-j+1);	
			}
			
		else{
			while(s.charAt(j)!= s.charAt(i)) {
				set.remove(s.charAt(j));
				j++;
			}
			set.remove(s.charAt(j));
			j++;
			set.add(s.charAt(i));
		}
		}
		System.out.println(set);
	}

}
