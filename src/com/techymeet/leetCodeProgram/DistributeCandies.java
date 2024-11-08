package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class DistributeCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int limit = sc.nextInt();
		System.out.println(findDistributeCandy(n,limit));

	}

	private static int findDistributeCandy(int n, int limit) {
		// TODO Auto-generated method stub
		int ans = 0;
		for(int i=0;i<=limit;i++) {
			int max = Math.max(0, n-i-limit);
			int min = Math.min(limit, n-i);
			if(min>=max) {
				int j = min-max+1;
				ans+=j;
			}
		}
		return ans;
	}

}
