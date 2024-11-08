package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SubArrayDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(findSumCount(list));

	}

	private static int findSumCount(List<Integer> list) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		int sum = 0;
			for(int i=0;i<list.size();i++) {
				for(int j=i;j<list.size();j++) {
					int a = i;
					while(a<=j) {
						map.put(list.get(a), 0);
						a++;
					}
					sum += map.size() * map.size();
					map.clear();
				}
			}
		return sum;
	}

}
