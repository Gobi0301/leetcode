package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class DivideArrayEqualPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] num = new int[n];
          for(int i=0;i<num.length;i++) {
        	  num[i] = sc.nextInt();
          }
          System.out.println(divideArr(num));
	}

	private static boolean divideArr(int[] num) {
		// TODO Auto-generated method stub
		int[] temp = new int[1000];
		for(int i:num) {
			temp[i]++;
		}
		for(int i=0;i<temp.length;i++) {
			if(temp[i] %2!=0) {
				return false;
			}
		}
		
		return true;
	}

}
