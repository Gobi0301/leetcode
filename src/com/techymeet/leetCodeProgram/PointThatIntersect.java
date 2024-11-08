package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class PointThatIntersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		List<List<Integer>> nums = new ArrayList<>();
		for(int i=0;i<row;i++) {
			List<Integer> arrRow = new ArrayList<>();
			for(int j=0;j<col;j++) {
				int x = sc.nextInt();
				arrRow.add(x);
			}
			nums.add(arrRow);
		}
		System.out.println(numberPoint(nums));

	}

	private static int numberPoint(List<List<Integer>> nums) {
		// TODO Auto-generated method stub
		 HashSet<Integer> set = new HashSet<>();
	        for(List<Integer> list:nums){
	            for(int i=list.get(0);i<=list.get(1);i++){
	                set.add(i);
	            }
	        }
	        return set.size();
	}

}
