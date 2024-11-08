package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumberDisappearedinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> ans = findDisappearedNumbers(nums);
		System.out.println(ans);
	}

	private static List<Integer> findDisappearedNumbers(int[] nums) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		int n = nums.length;
	   boolean[] num = new boolean[n];
	   for(int i=0;i<n;i++) {
		   num[nums[i]-1] = true;
	   }
	   for(int i=0;i<num.length;i++) {
		   if(!num[i]) {
			   list.add(i+1);
		   }
	   }
	   
		return list;
	}

}
