package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.Map;

public class ArrayConcatination1640 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,88};
		int[][] pieces = {{88},{15}};
		int[] ans = new int[arr.length];
		int index = 0;
		Map<Integer,int[]> map = new HashMap<>();
		for(int[] t:pieces) {
			map.put(t[0], t);
		}
		for(int t:arr) {
			if(map.containsKey(t)) {
				int i =0;
				for(;i<map.get(t).length;i++) {
					ans[index+i] = map.get(t)[i];
				}
				index+=i;
				}
			}
		if(ans.equals(arr)) {
			System.out.println("true");
		}
		}

	}


