package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,1,1};
        List<Boolean> list = prefixesDiv(nums);
        System.out.println(list);
	}

	private static List<Boolean> prefixesDiv(int[] nums) {
		// TODO Auto-generated method stub
		List<Boolean> list = new ArrayList<>();
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum = (sum * 2+nums[i]) % 5;
			if(sum !=0) {
				list.add(false);
			}else {
				list.add(true);
			}
		}
		return list;
	}

}
