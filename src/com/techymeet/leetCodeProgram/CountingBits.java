package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int n = 2;
	  int ans[] = countBits(n);
	  System.out.println(Arrays.toString(ans));
	}

	private static int[] countBits(int n) {
		// TODO Auto-generated method stub
	/*	int[] ans = new int[n+1];
		ans[0] = 0;
		if(n>=1) {
			ans[1] = 1;
		}
		for(int i=2;i<=n;i++) {
			if(i % 2== 0) {
				ans[i] = ans[i/2];
			}else {
				ans[i] = ans[i/2]+1;
			}
		}
		return ans;*/
		int[] ans = new int[n+1];
		countBits(ans,1,1);
		return ans;
	}

	private static void countBits(int[] ans, int n, int count) {
		// TODO Auto-generated method stub
		if(n >= ans.length)
			return;
		ans[n] = count;
		int val = n << 1;
		countBits(ans,val,count);
		countBits(ans,val+1,count+1);
	}

}
