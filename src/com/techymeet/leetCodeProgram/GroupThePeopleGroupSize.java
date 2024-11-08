package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGroupSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] groupSize = {3,3,3,3,3,1,3};
       List<List<Integer>> list = groupThePeople(groupSize);
       System.out.println(list);
	}

	private static List<List<Integer>> groupThePeople(int[] groupSize) {
		// TODO Auto-generated method stub
		Map<Integer,List<Integer>> map = new HashMap<>();
		List<List<Integer>> res = new ArrayList<>();
		for(int i=0;i<groupSize.length;i++) {
			int person = i;
			int groupsize = groupSize[i];
			List<Integer> list = map.getOrDefault(groupsize,new ArrayList<>());
			list.add(person);
			map.put(groupsize, list);
			if(list.size() == groupsize) {
				res.add(list);
				map.remove(groupsize);
			}
		}
		return res;
	}

}
