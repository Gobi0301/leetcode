package com.techymeet.leetCodeProgram;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdefg";
		int k = 2;
		String ans = reverseStr(s,k);
		System.out.println(ans);
	}

	private static String reverseStr(String s, int k) {
		// TODO Auto-generated method stub
		char[] c = s.toCharArray();
		int n = s.length();
		for(int i=0;i<=n-1;i+=2*k) {
			if(i+k-1<=n-1) {
				reverseK(i,i+k-1,c);
			}else {
				reverseK(i,n-1,c);
			}
		}
		String ans = new String(c);
		return ans;
	}

	private static void reverseK(int i, int j, char[] c) {
		// TODO Auto-generated method stub
		while(i<j) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		
	}

}
