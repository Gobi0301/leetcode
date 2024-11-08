package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] candidates = {2,3,6,7};
		int target = 7;
		List<List<Integer>> list = combinationSum(candidates,target);
		System.out.println(list);
	}

	private static List<List<Integer>> combinationSum(int[] candidates, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<>();
		makeCombination(candidates,target,0,new ArrayList<>(),0,res);
		return res;
	}

	private static void makeCombination(int[] candidates, int target, int idx, List<Integer> comb, int total,
			List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(total == target) {
			res.add(new ArrayList<>(comb));
			return;
		}
		
		if(total > target || idx >= candidates.length) {
			return;
		}
		
		comb.add(candidates[idx]);
		makeCombination(candidates, target, idx, comb, total+candidates[idx], res);
		comb.remove(comb.size()-1);
		makeCombination(candidates, target, idx+1, comb, total, res);
	}

}
