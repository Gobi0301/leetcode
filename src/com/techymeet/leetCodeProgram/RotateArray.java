package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	/*	int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]  = sc.nextInt();
		}
		int target = sc.nextInt();
		int[] res = rotateArray(arr,target);
		System.out.println(Arrays.toString(res));
		
*/
		
			//System.out.println("Hello World");
			int[] nums = {1,2,3,4,5,6,7};
			int k = 3;
			rotate(nums,k);
			System.out.println(Arrays.toString(nums));
		}
		
	
	static void rotate(int[] nums,int k){
	    k = k % nums.length;
	    if(k<0) {
	    	k += nums.length;
	    }
	    reverse(nums,0,nums.length-k-1);
	    reverse(nums,nums.length-k,nums.length-1);
	    reverse(nums,0,nums.length-1);
	    
	}
	/*private static int[] rotateArray(int[] arr, int target) {
		// TODO Auto-generated method stub
		for(int i=0;i<target;i++) {
			int j,last;
			last = arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
				arr[0] = last;
			
		}
		return arr;
	}
*/


	private static void reverse(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int left = i;
		int right = j;
		while(left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			
			left++;
			right--;
		}
	}
}
