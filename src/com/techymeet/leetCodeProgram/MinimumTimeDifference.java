package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> timePoints = Arrays.asList("23:59","00:00");
		int ans = findMinDifference(timePoints);
		System.out.println(ans);
	}

	private static int findMinDifference(List<String> timePoints) {
		// TODO Auto-generated method stub
		int[] mins = new int[timePoints.size()];
		for(int i=0;i<timePoints.size();i++) {
			String time = timePoints.get(i);
			int h = Integer.parseInt(time.substring(0,2));
			int m = Integer.parseInt(time.substring(3));
			mins[i] = h * 60 + m;
		}
		Arrays.sort(mins);
		
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<mins.length-1;i++) {
			ans = Math.min(ans, mins[i+1]-mins[i]);
		}
		
		return Math.min(ans, 24 * 60 - mins[mins.length-1]+mins[0]);
	}

}
