package com.techymeet.leetCodeProgram;

public class FindIntegerAddedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums1 = {2,6,4};
        int[] nums2 = {9,7,5};
        System.out.println(addedInteger(nums1,nums2));
	}

	private static int addedInteger(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		int sum1 = 0;
		for(int i:nums1) {
			sum1+=i;
		}
		int sum2 = 0;
		for(int i:nums2) {
			sum2+=i;
		}
		
		return (sum2-sum1)/nums1.length;
	}

}
