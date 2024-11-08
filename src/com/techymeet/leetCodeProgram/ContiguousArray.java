package com.techymeet.leetCodeProgram;

import java.util.HashMap;

public class ContiguousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums = {0,1};
      System.out.println(findMaxLen(nums));
	}

	private static int findMaxLen(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0;
		int maxCount = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, -1);
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 0) {
				count -=1;
			}
			else {
				count+=1;
			}
			if(map.containsKey(count)) {
				maxCount = Math.max(maxCount, i-map.get(count));
			}
			else {
				map.put(count, i);
			}
		}
		return maxCount;
	}

}
