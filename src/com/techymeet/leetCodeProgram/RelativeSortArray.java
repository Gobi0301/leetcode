package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class RelativeSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
       int[] arr2 = {2,1,4,3,9,6};
       System.out.println(Arrays.toString(relativeSort(arr1,arr2)));
	}

	private static int[] relativeSort(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int len = 0;
		for(int i=0;i<arr1.length;i++) {
			len = Math.max(len, arr1[i]);
		}
		int[] count = new int[len+1];
		for(int i=0;i<arr1.length;i++) {
			count[arr1[i]]++;
		}
		int[] ans = new int[arr1.length];
		int index = 0;
		for(int i=0;i<arr2.length;i++) {
			while(count[arr2[i]] > 0) {
				ans[index] = arr2[i];
				index++;
				count[arr2[i]]--;
			}
		}
		for(int i=0;i<count.length;i++) {
			while(count[i] > 0) {
				ans[index] = i;
				index++;
				count[i]--;
			}
		}
		return ans;
	}

}
