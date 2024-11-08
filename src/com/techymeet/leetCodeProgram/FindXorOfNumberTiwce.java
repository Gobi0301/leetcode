package com.techymeet.leetCodeProgram;

public class FindXorOfNumberTiwce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {1,2,2,1};
       System.out.println(duplicateNumberXor(nums));
	}

	private static int duplicateNumberXor(int[] nums) {
		// TODO Auto-generated method stub
		int ans = 0;
		int[] freq = new int[100];
		for(int i:nums) {
			freq[i]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i] == 2) {
				ans ^= i;
			}
		}
		return ans;
	}

}
