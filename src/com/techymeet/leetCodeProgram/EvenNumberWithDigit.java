package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class EvenNumberWithDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(evenNumber(nums));

	}

	private static int evenNumber(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0;
	  for(int i=0;i<nums.length;i++) {	
		  if(nums[i] < 10) {
			  
		  }
		  else if(nums[i] < 100) {
			  count+=1;
		  }
		  else if(nums[i] < 1000) {
			 
		  }
		  else if(nums[i] < 10000) {
			  count+=1;
		  }
		  else if(nums[i] == 100000) {
			  count+=1;
		  }
	  }
	
		
		return count;
	}

}
