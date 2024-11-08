package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class IntersectionTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums1[] = {4,9,5};
       int nums2[] = {9,4,9,8,4};
       System.out.println(Arrays.toString(intersection(nums1,nums2)));
	}

	private static int[] intersection(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<>();
		for(int i=0;i<nums1.length;i++) {
			set1.add(nums1[i]);
		}
		Set<Integer> set2 = new HashSet<>();
		for(int i=0;i<nums2.length;i++) {
			set2.add(nums2[i]);
			
		}
		List<Integer> list = new ArrayList<>();
		for(int i:set2) {
		if(set1.contains(i)) {
			list.add(i);
		}
		}
	int[] ans = new int[list.size()];
	for(int i=0;i<ans.length;i++) {
		ans[i] = list.get(i).intValue();
	}
		return ans;
	}

}
