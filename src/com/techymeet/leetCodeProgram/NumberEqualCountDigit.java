package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberEqualCountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
       System.out.println(findDigitCount(num));
	}

	private static boolean findDigitCount(String num) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		for(char c:num.toCharArray()) {
			int n = c - '0';
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		for(int i=0;i<num.length();i++) {
			int n = num.charAt(i) - '0';
			//System.out.println(map.getOrDefault(i, 0));
			if(n != map.getOrDefault(i, 0)) {
				return false;
			}
		}

		
		return true;
	}

}
