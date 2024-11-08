package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MaimumTwoProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n  = sc.nextInt();
       int[] num = new int[n];
       for(int i=0;i<num.length;i++) {
    	   num[i] = sc.nextInt();
       }
       System.out.println(productTwo(num));
	}

	private static int productTwo(int[] num) {
		// TODO Auto-generated method stub
		Arrays.sort(num);
		int len = num.length;
		int total  = (num[len-1]-1) * (num[len-2]-1);
		return total;
	}

}
