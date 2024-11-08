package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class AvgValueEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<arr.length;i++) {
    	  arr[i] = sc.nextInt();
      }
      System.out.println(findAvgValue(arr));
	}

	private static int findAvgValue(int[] arr) {
		// TODO Auto-generated method stub
		int sum  = 0;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] %3 ==0 && arr[i] %2==0) {
				sum+=arr[i];
				count++;
			}
		}
		if(sum == 0) {
			return 0;
		}
		int total = sum /count;
		return total;
	}

}
