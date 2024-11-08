package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class FindIndicesOfStableMountains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = {1,2,3,4,5};
		int threshold = 2;
		List<Integer> ans = stableMountains(height,threshold);
		System.out.println(ans);
	}

	private static List<Integer> stableMountains(int[] height, int threshold) {
		// TODO Auto-generated method stub
		int n = height.length;
		List<Integer> ans = new ArrayList<Integer>();
		for(int i=0;i<n-1;i++) {
			if(height[i] > threshold) {
				ans.add(i+1);
			}
		}
		return ans;
		
	}

}
