package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class DivideIntervalIntoMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] intervals = {{5,10},{6,8},{1,5},{2,3},{1,10}};
		int ans = minGroup(intervals);
		System.out.println(ans);

	}

	private static int minGroup(int[][] intervals) {
		// TODO Auto-generated method stub
		int n = intervals.length;
		int[] start = new int[n];
		int[] end = new int[n];
		
		for(int i=0;i<n;i++) {
			start[i] = intervals[i][0];
			end[i] = intervals[i][1];
		}
		
		Arrays.sort(start);
		Arrays.sort(end);

		int finish=0,count =0;
		for(int starts : start) {
			if(starts > end[finish]) {
				finish++;
			}else {
				count++;
			}
		}
		return count;
	}

}
