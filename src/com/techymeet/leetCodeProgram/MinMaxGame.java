package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class MinMaxGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(nums));
	}

	private static int minMaxGame(int[] nums) {
		// TODO Auto-generated method stub
		if(nums.length == 1) {
			return 1;
		}
		//List<Integer> newNum = new ArrayList<>();
		int[] newNum = new int[nums.length/2];
		for(int i=0;i<nums.length/2;i++) {
			if(i%2 == 0) {
				newNum[i] =(Math.min(nums[2*i], nums[2*i+1]));
			}else {
				newNum[i] = (Math.max(nums[2*i], nums[2*i+1]));
			}
		}
		//return minMaxGame(newNum.stream().mapToInt(i->i).toArray());
		
		return minMaxGame(newNum);
	}

}
