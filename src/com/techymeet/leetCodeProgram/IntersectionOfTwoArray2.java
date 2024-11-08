package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums1 = {4,9,5};
      int[] nums2 = {9,4,9,8,4};
      System.out.println(Arrays.toString(intersect(nums1,nums2)));
	}

	private static int[] intersect(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
	/*	List<Integer> list = new ArrayList<>();
		int i=0,j=0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		while(i<nums1.length && j< nums2.length) {
			if(nums1[i] == nums2[j]) {
				list.add(nums1[i]);
		        i++;
		        j++;
			}else if(nums1[i] < nums2[j]) {
				i++;
			}else {
				j++;
			}
		}
		int[] ans = new int[list.size()];
		for(int k=0;k<ans.length;k++) {
			ans[k] = list.get(k).intValue();
		}
		return ans;*/
		int[] arr = new int[10001];
		int[] res = new int[10001];
		for(int num:nums1) {
			arr[num]++;
		}
		int ctr = 0;
		for(int num:nums2) {
			if(arr[num] > 0) {
				res[ctr++] = num;
			}
			arr[num]--;
		}
		return Arrays.copyOfRange(res, 0, ctr);
	}

}
