package com.techymeet.leetCodeProgram;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int ans = maxArea(height);
		System.out.println(ans);
	}

	private static int maxArea(int[] height) {
		// TODO Auto-generated method stub
		int maxArea = 0;
		int left = 0;
		int right = height.length-1;
		
		while(left < right) {
			maxArea = Math.max(maxArea, (right-left) * Math.min(height[left], height[right]));
			
			if(height[left] < height[right]) {
				left++;
			}else {
				right--;
			}
		}
		
		return maxArea;
	}
	
}
