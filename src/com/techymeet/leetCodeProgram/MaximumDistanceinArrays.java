package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumDistanceinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(1,2,3));
		list.add(Arrays.asList(4,5));
		list.add(Arrays.asList(1,2,3));
		int ans = maxDistance(list);
		System.out.println(ans);
	}

	private static int maxDistance(List<List<Integer>> arrays) {
		// TODO Auto-generated method stub
		if(arrays == null || arrays.size() < 2)
			return 0;
		
		int globalMin = arrays.get(0).get(0);
		int globalMax = arrays.get(0).get(arrays.size()-1);
		int res = 0;
		
		for(int i=1;i<arrays.size();i++) {
			List<Integer> list = arrays.get(i);
			int localMin = list.get(0);
			int localMax = list.get(list.size()-1);
			
			res = Math.max(res, Math.max(localMax-globalMin, globalMax-localMin));
			globalMin = Math.min(globalMin, localMin);
			globalMax = Math.max(localMax, globalMax);
		}
		return res;
	}

}
