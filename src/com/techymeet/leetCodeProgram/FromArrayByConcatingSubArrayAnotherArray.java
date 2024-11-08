package com.techymeet.leetCodeProgram;

public class FromArrayByConcatingSubArrayAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] group = {{1,-1,1},{3,-2,0}};
		int[] nums = {1,-1,0,1,-1,-1,3,-2,0};
		boolean ans = canChoose(group,nums);
		System.out.println(ans);
	}

	private static boolean canChoose(int[][] group, int[] nums) {
		// TODO Auto-generated method stub
		int n = group.length;
		int nCol = group[0].length;
		int row = 0;
		
		for(int i=0;i<nums.length;i++) {
			int j = i;
			int col = 0;
			while(col < group[row].length && j<nums.length&&group[row][col] == nums[j]) {
				col++;
				j++;
			}
			if(col == group[row].length) {
				row++;
				i = j-1;
			}
			
			if(row == group.length) {
				return true;
			}
		}
		
		
		return false;
	}

}
