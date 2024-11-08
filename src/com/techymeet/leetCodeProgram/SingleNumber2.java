package com.techymeet.leetCodeProgram;

public class SingleNumber2 {

	public static void main(String[] args) {
		int[] nums = {2,2,3,2};
		int ans = singleNumber(nums);
		System.out.println(ans);
	}

	private static int singleNumber(int[] nums) {
		// TODO Auto-generated method stub
		/*int ans = 0;
		for(int i=31;i>=0;i--) {
			int sum = 0;
			for(int num:nums) {
				int n = (num >> i);
				if((n&1) == 1) {
					sum++;
				}
			}
			sum %=3;
			ans = (ans << 1);
			if(sum !=0) {
				ans+=1;
			}
		}
		return ans;*/
		int ones = 0;
	    int twos = 0;

	    for (final int num : nums) {
	      ones ^= (num & ~twos);
	      twos ^= (num & ~ones);
	    }

	    return ones;
	}
}
