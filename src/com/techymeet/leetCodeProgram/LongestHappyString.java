package com.techymeet.leetCodeProgram;

public class LongestHappyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 1;
		int c = 7;
		String ans = longestDiverseString(a,b,c);
		System.out.println(ans);
	}

	private static String longestDiverseString(int a, int b, int c) {
		// TODO Auto-generated method stub
		int currA = 0,currB = 0,currC = 0,i=0;
		int maxLen = a+b+c;
		StringBuilder sb = new StringBuilder();
		while(i< maxLen) {
			if(currA != 2 && a>=b && a>=c || a>0 &&(currB ==2 || currC == 2)) {
				sb.append('a');
				currA++;
				currB=0;
				currC = 0;
				a--;
			}else if(currB != 2 && b>=a && b>=c || b>0 &&(currA == 2 || currC == 2)) {
				sb.append('b');
				currB++;
				currA= 0;
				currC = 0;
				b--;
			}else if(currC != 2 && c>=a && c>=b || c>0 && (currA==2 || currB==2)) {
				sb.append('c');
				currC++;
				currA = 0;
				currB = 0;
				c--;
			}
			i++;
		}
		return sb.toString();
	}

}
