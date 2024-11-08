package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {4,2,1,3};
        List<List<Integer>> res = minimumAbsDifference(arr);
        System.out.println(res);
	}

	private static List<List<Integer>> minimumAbsDifference(int[] arr) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			min = Math.min(min, Math.abs(arr[i]-arr[i+1]));
		}
		for(int i=0;i<arr.length-1;i++) {
			if(Math.abs(arr[i] - arr[i+1]) == min) {
				list.add(Arrays.asList(arr[i],arr[i+1]));
			}
		}
		return list;
	}

}
