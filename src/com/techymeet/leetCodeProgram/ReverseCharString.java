package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ReverseCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h','e','l','l','o'};
		/*for(int i = s.length-1;i>=0;i--) {
			System.out.print(s[i] + " ");
		}
*/
		int i = 0;
		int j = s.length-1;
		char temp = 0;
		while(i<=j) {
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		
		}
		System.out.println(temp);
	}

}
