package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class NumberGoodPair {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  sc  = new Scanner(System.in);
/*int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i] = sc.nextInt();
}*/
int[] nums = {1,1,1,1,2};
int result = IdenticalPairs(nums);
System.out.println(result);
	}

	private static int IdenticalPairs(int[] nums) {
		// TODO Auto-generated method stub
		/*int result = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					result++;
				}
			}
		}
		return result;*/
		
		//
		
		  int goodPairs = 0;//count
		  int max = 0;
		  for(int i:nums) {
		max = Math.max(max,i);	  
		  }
	       int countMap[] = new int[max+1];//Intilazie // arrr

	       for(int num : nums) {
	            goodPairs = goodPairs + countMap[num];
	            countMap[num]++;
	       }  

	       return goodPairs;
		
	}

}
