package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class LastVisitedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {1,2,-1,-1,-1};
       List<Integer> list = lastVisitedInteger(nums);
       System.out.println(list);
	}

	private static List<Integer> lastVisitedInteger(int[] nums) {
		// TODO Auto-generated method stub
		List<Integer> seen = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		int k = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] > 0) {
				seen.add(0, nums[i]);
			}else {
				if(i!=0 && nums[i-1] != -1) {
					k=1;
				}else {
					k++;
				}
				if(k<=seen.size()) {
					ans.add(seen.get(k-1));
				}else {
					ans.add(-1);
				}
			}
		}
		return ans;
	}

}
