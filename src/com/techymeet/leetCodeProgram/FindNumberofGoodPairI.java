package com.techymeet.leetCodeProgram;

public class FindNumberofGoodPairI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums1 = {1,3,4};
        int[] nums2  = {1,3,4};
        int k = 1;
        System.out.println(numberOfPair(nums1,nums2,k));
	}

	private static int numberOfPair(int[] nums1, int[] nums2, int k) {
		// TODO Auto-generated method stub
		int n = nums1.length;
		int m = nums2.length;
		int count  = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if((nums1[i] % (nums2[j] * k) == 0)) {
					count++;
				}
			}
		}
		return count;
	}

}
