package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SignOfProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
     /*  int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<arr.length;i++) {
    	   arr[i] = sc.nextInt();
       }*/
       int[] arr = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
       System.out.println(arraySign(arr));
	}

	private static int arraySign(int[] arr) {
		// TODO Auto-generated method stub
		int ans = 1;
		for(int i=0;i<arr.length;i++) {
			 if(arr[i] > 0) {
				 ans = ans*1;
			 }
			 else if(arr[i] < 0) {
				 ans*=-1;
			 }
			 else {
				 ans*=0;
			 }
		}
	   if(ans > 0) {
		   return 1;
	   }
	   else if(ans == 0) {
		   return 0;
	   }
	   else {
		   return -1;
	   }
		
	}

}
