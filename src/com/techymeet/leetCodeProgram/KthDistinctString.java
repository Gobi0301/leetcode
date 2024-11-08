package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class KthDistinctString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] arr = {"a","b","a"};
      int k = 3;
      System.out.println(kthDistinct(arr,k));
	}

	private static String kthDistinct(String[] arr, int k) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new LinkedHashMap<>();
		for(String s:arr) {
			if(map.containsKey(s)) {
				map.put(s, map.getOrDefault(s, 0)+1);
			}else {
				map.put(s, 1);
			}
		}
		List<String> list = new ArrayList<>();
		/*for(Map.Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getValue() == 1) {
				list.add(entry.getKey());
			}
		}*/
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i]) == 1) {
				list.add(arr[i]);
			}
		}
		int d = k-1;
		for(int i=0;i<list.size();i++) {
			if(i == d) {
				return list.get(i);
			}
		}
		
		return "";
	}

}
