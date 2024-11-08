package com.techymeet.leetCodeProgram;

public class MinimumNumberOfOperationXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {2,1,3,4};
       int k = 1;
       System.out.println(minOperation(nums,k));
	}

	private static int minOperation(int[] nums, int k) {
		// TODO Auto-generated method stub
		int finalXor = 0;
		for(int i:nums) {
			finalXor ^= i;
		}
		
		int count = 0;
		while(k >0 || finalXor > 0) {
			if((k %2) != (finalXor %2)) {
				count++;
			}
			k/=2;
			finalXor/=2;
		}
		
		return count;
	}

}
