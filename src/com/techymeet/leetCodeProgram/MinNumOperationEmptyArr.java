package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinNumOperationEmptyArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findminOperation(arr));

	}

	private static int findminOperation(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		for(int i:arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		int ans  = 0;
		for(int i:map.values()) {
			if(i==1) {
				return -1;
			}
			ans += (i+2)/3;
			}
		return ans;
	}

}
