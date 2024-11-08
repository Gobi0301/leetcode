package com.techymeet.leetCodeProgram;

import java.util.HashSet;

import java.util.Scanner;

public class MinimumComonValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num1 = new int[n];
		for(int i=0;i<num1.length;i++) {
			num1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] num2 = new int[m];
		for(int i=0;i<num2.length;i++) {
			num2[i] = sc.nextInt();
		}
		System.out.println(minCommon(num1,num2));

	}

	private static int minCommon(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		//int min = Integer.MIN_VALUE;
		HashSet<Integer> set = new HashSet<>();
		int result  = -1;
		for(int i:num1) {
			set.add(i);		
			}
  for(int j:num2) {
	  if(set.contains(j)) {
		  result = j;
		  break;
	  }
  }
		return result;
	}

}
