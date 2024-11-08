package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Set;

public class MakeArrayZeroBySubtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,5,0,3,5};
        System.out.println(minimumOperation(nums));
	}
	
	public static int minimumOperation(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i:nums) {
			if(i>0) {
				set.add(i);
			}
		}
		return set.size();
	}

	

}
