package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class KeepMultiplyingFoundValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {2,7,9};
       int original = 4;
       int ans = findOriginalvalue(nums,original);
       System.out.println(ans);
	}

	private static int findOriginalvalue(int[] nums, int original) {
		// TODO Auto-generated method stub
		 int j=0;

         while(j<nums.length)
         {
             if(nums[j]==original)
             {
                 original=original*2;
                 j=0;
             }
             else
             j++;
         }   
		
		return original;
	}

}
