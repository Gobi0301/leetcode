package com.techymeet.leetCodeProgram;

public class MissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[] = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
	}

	private static int firstMissingPositive(int[] nums) {
		// TODO Auto-generated method stub
		
		int i = 0;
		while(i<nums.length) {
			int index = nums[i] -1;
			if(index>=0 && index < nums.length && nums[i] != nums[index]) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index]  = temp;
			}
			else {
				i++;
			}
		}
		for(int index=0;index<nums.length;index++) {
			if(index != nums[index]-1)
				return index+1;
		}
		return nums.length+1;
	}

}
