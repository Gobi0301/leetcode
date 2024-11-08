package com.techymeet.leetCodeProgram;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String s = sc.next();
       System.out.println(unqiueCharacterString(s));
	}

	private static int unqiueCharacterString(String s) {
		// TODO Auto-generated method stub
		/*Set<String> s1 = new LinkedHashSet<String>();*/
		/*for(int i=0;i<s.length();i++) {
			int c = s.charAt(i);
			if(i == s.lastIndexOf(c) && i == s.indexOf(c))
				return i;
		}
		return -1;
	}*/
		HashSet<Character> set = new HashSet<Character>();
		HashSet<Character> set1 = new HashSet<Character>();

		for(char c: s.toCharArray()) {
			set1.add(c);
			if(set.contains(c))
				set1.remove(c);
			set.add(c);
		}
		if(set1.isEmpty()) {
			return -1;
		}
		int i= 0;
		for(char c:s.toCharArray()) {
			if(set1.contains(c)) {
				return i;
			}
			i++;
		}
		return -1;
}
}