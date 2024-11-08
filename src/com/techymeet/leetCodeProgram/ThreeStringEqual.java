package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ThreeStringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		System.out.println(findMinimumOperation(s1,s2,s3));

	}

	private static int findMinimumOperation(String s1, String s2, String s3) {
		// TODO Auto-generated method stub
		int n1 = s1.length();
		int n2 = s2.length();
		int n3 = s3.length();
		int n = Math.min(Math.min(n1,n2), n3);
		int ans = 0, index = 0;
		for(int i=0;i<n;i++) {
			if(i==0) {
				if((s1.charAt(i) != s2.charAt(i)) || (s2.charAt(i) != s3.charAt(i)) || (s1.charAt(i) != s3.charAt(i))) {
				return -1;
				}
			}
			else {
				if((s1.charAt(i) != s2.charAt(i)) || (s2.charAt(i) != s3.charAt(i)) || (s1.charAt(i) != s3.charAt(i))) {
				index = i;
				break;
				}
			}
		}
		if(index == 0) {
			index = n;
		}
		ans = ans+(n1-index)+(n2-index)+(n3-index);
		
		return ans;
	}

}
