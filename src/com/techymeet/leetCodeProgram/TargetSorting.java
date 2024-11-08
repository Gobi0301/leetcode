package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TargetSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
System.out.println(targetIndices(nums,target));
	}

	private static List<Integer> targetIndices(int[] nums, int target) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				list.add(i);
			}
		}
		
		return list;
	}

}
