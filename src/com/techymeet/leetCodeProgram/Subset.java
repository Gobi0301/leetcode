package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		List<List<Integer>> list = subet1(nums);
		System.out.println(list);
	}

	private static List<List<Integer>> subet(int[] nums) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<>();
		/*res.add(new ArrayList<>());
		for(int num:nums) {
			int size = res.size();
			for(int i=0;i<size;i++) {
				List<Integer> subset = new ArrayList<>(res.get(i));
				subset.add(num);
				res.add(subset);
			}
		}*/
		Arrays.sort(nums);
		backtrack(res,new ArrayList<>(),nums,0);
		return res;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int start) {
		// TODO Auto-generated method stub
		list.add(new ArrayList<>(temp));
		for(int i=start;i<nums.length;i++) {
			temp.add(nums[i]);
			backtrack(list,temp,nums,i+1);
			temp.remove(temp.size()-1);
		}
	}
	
	private static List<List<Integer>> subet1(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		List<List<Integer>> res = new ArrayList<>();
		//res.add(new ArrayList<>());
		int subset = 1 << n;
		/*for(int num:nums) {
			int size = res.size();
			for(int i=0;i<size;i++) {
				List<Integer> subset = new ArrayList<>(res.get(i));
				subset.add(num);
				res.add(subset);
			}
		}*/
		
		for(int num=0;num<subset;num++) {
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<n;i++) {
				if((num &(1<<i)) != 0) {
					list.add(nums[i]);
				}	
				
			}
			res.add(list);
			
		}
		
		return res;
	}

	

}
