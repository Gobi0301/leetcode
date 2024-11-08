package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] stones = {2,7,4,1,8,1};
       int res = lastStoneWeight(stones);
       System.out.println(res);  
	}

	private static int lastStoneWeight(int[] stones) {
		// TODO Auto-generated method stub
	/*	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i:stones) {
			pq.add(i);
		}
		while(pq.size() > 1) {
			pq.add(pq.poll() - pq.poll());
		}
		return pq.poll();*/
		
		int n = stones.length;
		while(n > 1) {
			Arrays.sort(stones);
			
			int y = stones[n-1];
			int x = stones[n-2];
			
			if(x == y) {
				n -= 2;
			}else {
				stones[n-2] = y-x;
				n -= 1;
			}
			
		}
		if(n == 0) {
			return 0;
		}else {
			return stones[0];
		}
		
	}

	

}
