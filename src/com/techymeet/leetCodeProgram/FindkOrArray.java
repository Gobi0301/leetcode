package com.techymeet.leetCodeProgram;

public class FindkOrArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {7,12,9,8,9,15};
        int k = 4;
        int res = findKOr(nums,k);
        System.out.println(res);
	}

	private static int findKOr(int[] nums, int k) {
		// TODO Auto-generated method stub
	/*	int ans = 0;
		int[] arr = new int[32];
		for(int i=0;i<nums.length;i++) {
			
			int num = nums[i];
			int index = 0;
			while(num != 0) {
				int dig = num % 2;
				num /=2;
				if(dig == 1) {
					arr[index]++;
				}
				index++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= k) {
				ans+= (int) Math.pow(2, i);
			}
		}
		return ans;*/
		
		  int ans = 0;
	        for (int i = 0; i < 32; ++i) {
	            int cnt = 0;
	            for (int x : nums) {
	                cnt += (x >> i & 1);
	            }
	            if (cnt >= k) {
	                ans |= 1 << i;
	            }
	        }
	        return ans;
	}

}
