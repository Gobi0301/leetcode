package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class PrefixCommonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] a = {1,3,2,4};
           int[] b = {3,1,2,4};
           System.out.println(Arrays.toString(findCommonArray(a,b)));
	}

	private static int[] findCommonArray(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int n = a.length;
		int c = 0;
		int[] ans = new int[n];
		int[] seen = new int[n+1];
		for(int i=0;i<n;i++) {
			if(++seen[a[i]] == 2) {
				c++;
			}
			if(++seen[b[i]] == 2) {
				c++;
			}
			ans[i] = c;
		}
		return ans;
	}

}
