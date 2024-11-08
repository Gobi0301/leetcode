package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumIndexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		String[] str1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] str2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		HashMap<String,Integer> map = new HashMap<>();
		for(int i=0;i<str1.length;i++) {
			map.put(str1[i], i);
		}
		int min = Integer.MAX_VALUE;
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<str2.length;i++) {
			if(map.containsKey(str2[i])) {
				int sum = map.get(str2[i]) + i;
				if(sum < min) {
					min = sum;
					list.clear();
					list.add(str2[i]);
				}
				else if(min == sum) {
					list.add(str2[i]);
				}
			}
		}
		System.out.println(list.toArray());

	}

}
