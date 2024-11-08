package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class HomeWorkAtTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n =  sc.nextInt();
       int[] num1 = new int[n];
       for(int i=0;i<num1.length;i++) {
    	   num1[i] = sc.nextInt();
       }
       int m = sc.nextInt();
       int[] num2 = new int[m];
       for(int i=0;i<num2.length;i++) {
    	   num2[i] = sc.nextInt();
       }
       int l = sc.nextInt();
       System.out.println(atTime(num1,num2,l));
	}

	private static int atTime(int[] num1, int[] num2 , int l) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<num1.length;i++) {
				if(num1[i] <= l && num2[i] >= l ) {
					count++;
				}
				
				
			}
		
		return count;
	}

}
