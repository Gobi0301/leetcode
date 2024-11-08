package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class CheckifArrayGood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  = new Scanner(System.in);
       int n = sc.nextInt();
       int[] num = new int[n];
       for(int i=0;i<num.length;i++) {
    	   num[i] = sc.nextInt();
       }
       System.out.println(Array(num));
	}

	private static boolean Array(int[] num) {
		// TODO Auto-generated method stub
		int m = Integer.MIN_VALUE;
		for(int i:num) {
			m = Math.max(m, i);
		}
		int a[] = new int[m+1];
		a[m] =  m;
		a[m-1] = m;
		for(int i=0;i<m-1;i++) {
			a[i] = i+1;
		}
		if(a.length != num.length) {
			return false;
		}
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			if(a[i] != num[i])
             return false;
		}
		return true;
	}

}
