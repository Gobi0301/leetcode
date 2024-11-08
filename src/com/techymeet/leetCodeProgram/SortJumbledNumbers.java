package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortJumbledNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int mapping[] = {8,9,4,0,2,1,3,5,7,6};
      int nums[] = {991,338,38};
      System.out.println(Arrays.toString(sortJumbled(mapping,nums)));
	}

	private static int[] sortJumbled(int[] mapping, int[] nums) {
		// TODO Auto-generated method stub
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			String s = Integer.toString(nums[i]);
			StringBuilder sb = new StringBuilder();
			for(char c:s.toCharArray()) {
				sb.append(mapping[c-'0']);
			}
			list.add(new int[] {nums[i],Integer.parseInt(sb.toString()),i});
		}
		
		list.sort((a,b) -> {
			if(a[1] != b[1]) {
				return Integer.compare(a[1], b[1]);
			}else {
				return Integer.compare(a[2], b[2]);
			}
		});
		
		int[] sortNum = new int[nums.length];
		for(int i=0;i<list.size();i++) {
			sortNum[i] = list.get(i)[0];
		}
		
		return sortNum;
	} 

}
