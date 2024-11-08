package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumOperationtoCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> nums = new ArrayList<>();
        nums.add(3); nums.add(1); nums.add(5); nums.add(4); nums.add(2);
        int k = 2;
        System.out.println(minOperation(nums,k));
	}

	private static int minOperation(List<Integer> nums, int k) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		for(int i=1;i<=k;i++) {
			set.add(i);
		}
		int count = 0;
		for(int i=nums.size()-1;i>0;i--) {
			count++;
			if(set.contains(nums.get(i))) {
				set.remove(nums.get(i));
				if(set.isEmpty()) {
					break;
				}
			}
		}
		return count;
	}

}
