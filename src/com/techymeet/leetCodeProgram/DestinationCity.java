package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String[][] str = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
		List<List<String>>  paths = new ArrayList<List<String>>();
		for(String[] s:str) {
			paths.add(Arrays.asList(s));
		}
		System.out.println(destCity(paths));
     	}

	private static String destCity(List<List<String>> paths) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		for(List<String> path:paths) {
			map.put(path.get(0), path.get(1));
		}
		if(paths == null && paths.size() ==0) {
			return "";
		}
		String start = paths.get(0).get(0);
		while(map.containsKey(start)) {
			start = map.get(start);
		}
		return start;
	}

}
