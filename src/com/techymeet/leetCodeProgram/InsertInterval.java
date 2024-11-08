package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterval = {4,8};
		System.out.println(Arrays.deepToString(insert(intervals,newInterval)));
	}

	private static int[][] insert(int[][] intervals, int[] newInterval) {
		// TODO Auto-generated method stub
		List<int[]> ans = new ArrayList<>();
		int start = newInterval[0],end = newInterval[1];
		boolean inserted = false;
		
		for(int[] inv:intervals) {
			int cStart = inv[0] ,cEnd=inv[1];
			
			if(cEnd < start || inserted) {
				ans.add(new int[] {cStart,cEnd});
				continue;
			}
			start = Math.min(start, cStart);
			if(end < cStart) {
				ans.add(new int[] {start,end});
				ans.add(new int[] {cStart,cEnd});
				inserted  = true;
				continue;
				
			}
			if(end <=cEnd) {
				ans.add(new int[] {start,cEnd});
				inserted = true;
			}
		}
		if(!inserted) {
			ans.add(new int[] {start,end});
		}
		return ans.toArray(new int[ans.size()][]);
	}

}
