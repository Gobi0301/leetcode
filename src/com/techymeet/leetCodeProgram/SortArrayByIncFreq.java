package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class comp  implements Comparator<Map.Entry<Integer, Integer>>{

	@Override
	public int compare(Entry<Integer, Integer> m1, Entry<Integer, Integer> m2) {
		// TODO Auto-generated method stub
		if(m1.getValue() == m2.getValue()) {
			return -m1.getKey() + m2.getKey();
		}	
		return m1.getValue() - m2.getValue();
	}
	
}

public class SortArrayByIncFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        System.out.println(Arrays.toString(freqSort(nums)));
	}

	private static int[] freqSort(int[] nums) {
		// TODO Auto-generated method stub
		/*int max = 0;
		for(int i=0;i<nums.length;i++) {
			max = Math.max(max, nums[i]);
		}
		int[] freq = new int[max+1];
		for(int i=0;i<nums.length;i++) {
			freq[nums[i]]++;
		}*/
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i:nums) {
			if(map.containsKey(i)) {
				map.put(i, map.getOrDefault(i, 0)+1);
			}else {
				map.put(i, 1);
			}
		}
		List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list,new comp());
		
		int[] ans = new int[nums.length];
		int size = 0;
		for(Map.Entry<Integer, Integer> entry:list) {
			int val = entry.getValue();
			while(val >0) {	
				ans[size++] = entry.getKey();
				val--;
 			}
		}
		return ans;
	}

}
