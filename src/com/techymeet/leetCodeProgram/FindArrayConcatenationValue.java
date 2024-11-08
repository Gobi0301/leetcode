package com.techymeet.leetCodeProgram;

public class FindArrayConcatenationValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {7,52,2,4};
        System.out.println(findArrayConval(nums));
	}

	private static long findArrayConval(int[] nums) {
		// TODO Auto-generated method stub
		long res = 0L;
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int j = nums.length-1;
		while(j>=i) {
			if(j==i) {
				sb.append(nums[i]);
			}else {
				sb.append(nums[i]).append(nums[j]);
			}
			int temp = Integer.parseInt(sb.toString());
			sb.setLength(0);
			res+=temp;
			j--;
			i++;
		}
		return res;
	}

}
