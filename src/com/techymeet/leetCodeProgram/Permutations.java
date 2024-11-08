package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {1,2,3};
       List<List<Integer>> list = permute(nums);
       System.out.println(list);
	}

	private static List<List<Integer>> permute(int[] nums) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<>();
		backtrack(res,new ArrayList<>(),nums);
		return res;
	}

	private static void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] nums) {
		// TODO Auto-generated method stub
		if(tempList.size() == nums.length) {
			res.add(new ArrayList<>(tempList));
		}else {
			for(int i=0;i<nums.length;i++) {
				if(tempList.contains(nums[i])) continue;
				tempList.add(nums[i]);
				backtrack(res,tempList,nums);
				tempList.remove(tempList.size()-1);
			}
		}
		
	}

}
