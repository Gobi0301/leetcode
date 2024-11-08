package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] candidates  = {10,1,2,7,6,1,5};
		int target = 8;
		List<List<Integer>> list = combinationSum2(candidates,target);
		System.out.println(list);
	}

	private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(candidates);
		makeCombinations(candidates,target,0,new ArrayList<>(),res,0);
		return res;
	}

	private static void makeCombinations(int[] candidates, int target, int idx, List<Integer> comb,
			List<List<Integer>> res, int total ) {
		// TODO Auto-generated method stub
		if(total == target) {
			res.add(new ArrayList<>(comb));
			return;
		}
		
		if(total > target || idx > candidates.length) {
			return;
		}
		
		for(int j=idx;j<candidates.length;j++) {
			if(j > idx && candidates[j] == candidates[j-1]) continue;
			comb.add(candidates[j]);
			makeCombinations(candidates,target,j+1,comb,res,total+candidates[j]);
			comb.remove(comb.size()-1);
		}
		return;
	}

}
