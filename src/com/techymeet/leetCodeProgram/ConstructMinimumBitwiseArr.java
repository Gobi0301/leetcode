package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.List;

public class ConstructMinimumBitwiseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> nums = Arrays.asList(2,3,5,7);
     int[] ans = minBitwisArray(nums);
     System.out.println(Arrays.toString(ans));
	}

	private static int[] minBitwisArray(List<Integer> nums) {
		// TODO Auto-generated method stub
		int n = nums.size();
		int[] ans = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<nums.get(i);j++) {
				if((j | (j+1)) == nums.get(i)) {
					ans[i] = j;
					break;
				}
			}
			if(ans[i] == 0) {
				ans[i] = -1;
			}
		}
		return ans;
	}

}
