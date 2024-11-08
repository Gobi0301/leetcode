package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AcronymWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*String[] str = new String[n];
		int pos = -1;
		while(++pos < n) {
			str[pos] = sc.nextLine();
		}*/
		List<String> str = new ArrayList<>();
		for(int i=0;i<n;i++) {
		  str.add(sc.nextLine());
		}
		
		String s = sc.nextLine();
		System.out.println(acronymWord(str,s));
		

	}

	private static boolean acronymWord(List<String> str, String s) {
		// TODO Auto-generated method stub
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<str.size();i++) {
		sb.append(str.get(i).charAt(0));
	}
		return sb.toString().equals(s);
	}

}
