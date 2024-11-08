package com.techymeet.leetCodeProgram;

public class NRepeatedElementSizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,2,3,3};
        int res = repeatedTimes(nums);
        System.out.println(res);
	}

	private static int repeatedTimes(int[] nums) {
		// TODO Auto-generated method stub
		int max = 0;
		for(int i=0;i<nums.length;i++) {
			max = Math.max(max, nums[i]);
		}
		int[] freq = new int[max+1];
		for(int i=0;i<nums.length;i++) {
			freq[nums[i]]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i] > 1) {
				return i;
			}
		}
		return 0;
	}

}
