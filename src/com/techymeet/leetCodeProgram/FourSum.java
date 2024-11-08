package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,0,-1,0,-2,2};
		int target = 0;
		List<List<Integer>> ans = fourSum(nums,target);
		System.out.println(ans);
	}

	private static List<List<Integer>> fourSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();
		Set<List<Integer>> set = new HashSet<>();
		
		Arrays.sort(nums);
		int n = nums.length;
		for(int a=0;a<n;a++) {
			
			int b = a + 1;
			int c = b + 1;
			int d = n - 1;
			
			while(b<d && b<c) {
				while(c<d) {
				long sum = (long) nums[a]+nums[b]+nums[c]+nums[d];
				if(sum == target) {
					set.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
					c++;
					d--;
				}
				else if(sum < target){
					c++;
				}else {
					d--;
				}
				}
				b++;
				c=b+1;
				d=n-1;
			}
		}
		list.addAll(set);
		
		return list;
	}

}
