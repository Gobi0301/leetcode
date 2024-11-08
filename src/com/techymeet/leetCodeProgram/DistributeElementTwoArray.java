package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistributeElementTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {2,1,3};
        System.out.println(Arrays.toString(resultArray(nums)));
	}

	private static int[] resultArray(int[] nums) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
	    list1.add(nums[0]);
	    List<Integer> list2 = new ArrayList<>();
	    list2.add(nums[1]);
	    for(int i=2;i<nums.length;i++) {
	    	if(list1.get(list1.size()-1) > list2.get(list2.size()-1) ) {
	    		list1.add(nums[i]);
	    	}else {
	    		list2.add(nums[i]);
	    	}
	    }
	    int count = 0;
	    int[] ans = new int[list1.size()+list2.size()];
	    for(int i=0;i<list1.size();i++) {
	    	ans[count++] = list1.get(i);
	    }
	    for(int i=0;i<list2.size();i++) {
	    	ans[count++] = list2.get(i);
	    }
		return ans;
	}

}
