package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SmallestRangeCoveringElementFromKList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> nums = Arrays.asList((Arrays.asList(4,10,15,24,26)),(Arrays.asList(0,9,12,20)),
				                                   (Arrays.asList(5,18,22,30)));
		
		int[] ans = smallestRange(nums);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] smallestRange(List<List<Integer>> nums) {
		// TODO Auto-generated method stub
		List<int[]> ordered = new ArrayList<>();
		
		for(int i=0;i<nums.size();i++) {
			for(int n:nums.get(i)) {
				ordered.add(new int[] {n,i});
			}
		}
		
		
		
		Collections.sort(ordered , (a,b) -> Integer.compare(a[0], b[0]));
		
		int i=0,k=0;
		int[] ans = new int[0];
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int j=0;j<ordered.size();j++) {
			
			if(map.getOrDefault(ordered.get(j)[1], 0) == 0) ++k;
			map.put(ordered.get(j)[1], map.getOrDefault(ordered.get(j)[1], 0)+1);
			
			if(k == nums.size()) {
				
				while(map.get(ordered.get(i)[1]) > 1) {
					map.put(ordered.get(i)[1], map.get(ordered.get(i)[1])-1);
					i++;
				}
				
				if(ans.length == 0 || ans[1] - ans[0] > ordered.get(j)[0] - ordered.get(i)[0]) {
					ans = new int[] {ordered.get(i)[0] , ordered.get(j)[0]};
				}
			}
		}
		
		return ans;
	}

}
