package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,3,2,7,8,2,3,1};
	   List<Integer>  list = findduplicate(nums);
	   System.out.println(list);

	}

	private static List<Integer> findduplicate(int[] nums) {
		// TODO Auto-generated method stub
		int m = 0;
		for(int i=0;i<nums.length;i++) {
			m= Math.max(m, nums[i]);
		}
		int[] freq = new int[m+1];
		for(int i=0;i<nums.length;i++) {
			freq[nums[i]]++;
		}
		List<Integer> ans = new ArrayList<>();
		for(int i=0;i<freq.length;i++) {
			if(freq[i] >=2) {
				ans.add(i);
			}
		}
		return ans;
	}

}
