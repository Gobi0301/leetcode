package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public abstract class MinCostClimbing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] num = new int[n];
      for(int i=0;i<num.length;i++) {
    	  num[i] = sc.nextInt();
      }
      System.out.println(minCost(num));

	}
	private static int minCost(int[] num) {
		// TODO Auto-generated method stub
		int n = num.length;
		int[] ans = new int[n];
		ans[0] = num[0];
		ans[1] = num[1];
		for(int i=2;i<num.length;i++) {
			ans[i] = num[i] + Math.min(ans[i-1], ans[i-2]);
		}
		
		
		
		return Math.min(ans[n-1], ans[n-2]);
		
	}	

}
