package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class XORQueriesOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,4,8};
		int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
		int[] ans = xorQueries(arr,queries);
		System.out.println(Arrays.toString(ans));
		
	}

	private static int[] xorQueries(int[] arr, int[][] queries) {
		// TODO Auto-generated method stub
	int n = arr.length;
	int m = queries.length;
	
	for(int i=1;i<n;i++) {
		arr[i] ^= arr[i-1];
	}
	int[] res = new int[m];
	for(int i=0;i<m;i++) {
		int start = queries[i][0],end=queries[i][1];
		res[i] = start > 0 ? arr[end] ^ arr[start-1] : arr[end];
	}
return res;	
	}

}
