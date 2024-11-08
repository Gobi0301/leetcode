package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class SingleNumberIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,3,2,5};
		singleNumber(nums);
	}

	private static void singleNumber(int[] nums) {
		// TODO Auto-generated method stub
		/*int xor = 0;
		for(int num:nums) {
			xor ^= num;
		}
		int diff = xor &- xor;
		int first = 0;
		for(int num:nums) {
			if((num & diff) != 0) {
				first ^= num;
			}
		}
		return new int[] {first,xor^first};*/
		Map<Integer,Integer> map = new HashMap<>();
		for(int num :nums) {
			if(map.containsKey(num)) {
				map.put(num, map.getOrDefault(num, 0)+1);
			}else {
				map.put(num, 1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
