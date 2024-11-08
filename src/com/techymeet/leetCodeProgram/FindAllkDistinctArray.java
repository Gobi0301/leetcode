package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class FindAllkDistinctArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {3,4,9,1,3,9,5};
       int key = 9;
       int k = 1;
       List<Integer> res = findKDistinctIndices(nums,key,k);
       System.out.println(res);
	}

	private static List<Integer> findKDistinctIndices(int[] nums, int key, int k) {
		// TODO Auto-generated method stub
		List<Integer> ans = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			int index = -1;
			for(int j=0;j<nums.length;j++) {
				if(Math.abs(i-j) <= k && nums[j] == key) {
					index = i;
				}
				
			}
			if(index != -1) {
				ans.add(index);
			}
			
		}
		return ans;
	}

}
