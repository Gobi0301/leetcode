package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {10,3,8,9,4};
		System.out.println(Arrays.toString(findrelativeRanks(score)));
	}

	private static String[] findrelativeRanks(int[] score) {
		// TODO Auto-generated method stub
		String[] ans = new String[score.length];
		/*int gold = 0;
		for(int i=0;i<score.length;i++) {
			gold = Math.max(gold, score[i]);
		}
		int silver = 0;
		for(int i=0;i<score.length;i++) {
			if(score[i] != gold) {
				silver = Math.max(silver, score[i]);
			}
		}
		int bronze = 0;
		for(int i=0;i<score.length;i++) {
			if(score[i] != gold && score[i] != silver) {
				bronze = Math.max(bronze, score[i]);
			}
		}
		int last = Integer.MAX_VALUE;
		for(int i=0;i<score.length;i++) {
			last = Math.min(last, score[i]);
		}
		int secondLast = Integer.MAX_VALUE;
		for(int i=0;i<score.length;i++) {
			if(score[i] != last)
			secondLast = Math.min(secondLast, score[i]);
		}
		for(int i=0;i<score.length;i++) {
			if(score[i] == gold) {
				ans[i] = "Gold Medal";
			}else if(score[i] == silver) {
				ans[i] = "Silver Medal";
			}else if(score[i] == bronze) {
				ans[i] = "Bronze Medal";
			}else if(score[i] == secondLast) {
				ans[i] = "4";
			}else if(score[i] == last) {
				ans[i] = "5";
			}
		}
		*/
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<score.length;i++) {
			map.put(score[i], i);
		}
		Arrays.sort(score);
		for(int i=score.length-1;i>=0;i--) {
			int rank = score.length-i;
			if(rank == 1) {
				ans[map.get(score[i])] = "Gold Medal";
			}else if(rank == 2) {
				ans[map.get(score[i])] = "Silver Medal";
			}else if(rank == 3) {
				ans[map.get(score[i])] = "Bronze Medal";
			}else {
				ans[map.get(score[i])] = String.valueOf(rank);
			}
		}
		
		return ans;
	}

}
