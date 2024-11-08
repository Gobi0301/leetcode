package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		List<List<Integer>> list = findThreeSum(nums);
System.out.println(list);
	}

	private static List<List<Integer>> findThreeSum(int[] nums) {
		// TODO Auto-generated method stub
		int target = 0;
		Arrays.sort(nums);
		Set<List<Integer>> set = new HashSet<>();
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			int j = i+1;
			int k = nums.length-1;
			while(j<k) {
				int sum = nums[i] + nums[j] + nums[k];
				if(sum == target) {
					set.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					k--;
				}
				else if(sum < target) {
					j++;
				}
				else {
					k--;
				}
			}
		}
		list.addAll(set);
		return list;
	}

}
