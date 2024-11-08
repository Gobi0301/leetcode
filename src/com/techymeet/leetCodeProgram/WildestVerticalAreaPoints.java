package com.techymeet.leetCodeProgram;

import java.util.Collections;
import java.util.PriorityQueue;

public class WildestVerticalAreaPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] points = {{8,7},{9,9},{7,4},{9,7}};
       System.out.println(manWidthOfVerticalArea(points));
	}

	private static int manWidthOfVerticalArea(int[][] points) {
		// TODO Auto-generated method stub
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			for(int[] point :points) {
				pq.add(point[0]);
			}
			int ans = 0;
			int prev = pq.poll();
			while(!pq.isEmpty()) {
				int cur = pq.poll();
				ans = Math.max(ans, prev-cur);
				prev = cur;
			}
			return ans;
	}

}
