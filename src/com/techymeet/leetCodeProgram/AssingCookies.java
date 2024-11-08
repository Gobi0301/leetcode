package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class AssingCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] g = new int[n];
		for(int i=0;i<n;i++) {
			g[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] s = new int[m];
		for(int i=0;i<m;i++) {
			s[i] = sc.nextInt();
		}
		System.out.println(findAssignCookie(g,s));
	}

	private static int findAssignCookie(int[] g, int[] s) {
		// TODO Auto-generated method stub
		int cookiesNum = s.length;
		if(cookiesNum == 0)
			return 0;
		Arrays.sort(g);
		Arrays.sort(s);
		
		int maxNum = 0;
		int cookieIndex = cookiesNum-1;
		int childIndex = g.length-1;
		while(cookieIndex >= 0 && childIndex >=0) {
			if(s[cookieIndex] >= g[childIndex]) {
				maxNum++;
				cookieIndex--;
			}
			childIndex--;
		}
		return maxNum;
	}

}