package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberofWinning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		int[][] pick = {{0,0},{1,0},{1,0},{2,1},{2,1},{2,0}};
		int ans = winningPlayerCount(n,pick);
		System.out.println(ans);
	}

	private static int winningPlayerCount(int n, int[][] pick) {
		// TODO Auto-generated method stub
		Map<Integer,Map<Integer,Integer>> map = new HashMap<>();	
		for(int i=0;i<n;i++) {
			map.put(i, new HashMap<>());
		}
		
		for(int[] p:pick) {
			int x = p[0] , y = p[1];
			map.get(x).put(y, map.get(x).getOrDefault(y, 0)+1);
		}
		
		int res = 0;
		for(int key : map.keySet()) {
			Map<Integer,Integer> m = map.get(key);
			//int count = 0;
			for(int k:m.keySet()) {
				if(key < m.get(k)) {
					res++;
					break;
				}
			}
		}
		
		return res;
	}

}
