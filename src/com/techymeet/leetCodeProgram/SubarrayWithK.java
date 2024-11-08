package com.techymeet.leetCodeProgram;

import java.util.HashMap;

public class SubarrayWithK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,1,2,3};
        int k = 2;
        System.out.println(subArrayWithDistinct(nums,k));
	}

	private static int subArrayWithDistinct(int[] nums, int k) {
		// TODO Auto-generated method stub
		return countSubArrayWithAtMostK(nums,k) - countSubArrayWithAtMostK(nums,k-1);
	}

	private static int countSubArrayWithAtMostK(int[] nums, int k) {
		// TODO Auto-generated method stub
		int start = 0;
		int count = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int end =0;end<nums.length;end++) {
			map.put(nums[end], map.getOrDefault(nums[end], 0)+1);
			
			while(map.size() > k) {
				map.put(nums[start],map.get(nums[start])-1);
				if(map.get(nums[start]) == 0) {
					map.remove(nums[start]);
				}
				start++;
			}
			count += end - start +1;
		}
		
		return count;
	}

}
