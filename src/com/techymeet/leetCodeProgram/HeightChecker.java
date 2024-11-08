package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] heights = {1,1,4,2,1,3};
      System.out.println(heightChecker(heights));
	}

	private static int heightChecker(int[] heights) {
		// TODO Auto-generated method stub
	int[] temp = Arrays.copyOf(heights,heights.length);
	 Arrays.sort(heights);
	 int ans = 0;
	 for(int i=0;i<heights.length;i++) {
		 if(heights[i] != temp[i] ) {
			 ans++;
		 }
	 }
		return ans;
	}

}
