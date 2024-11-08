package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TransformArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = transformArray(arr);
		System.out.println(Arrays.toString(res));

	}

	private static int[] transformArray(int[] arr) {
		// TODO Auto-generated method stub
		int[] rank = arr.clone();
		Map<Integer,Integer> mp = new LinkedHashMap<>();
		Arrays.sort(arr);
		int a = 1;
		if(arr.length == 0)
			return arr;
		int prev = arr[0];
		for(int num : arr) {
			if(prev != num) {
				a++;
			}
			mp.putIfAbsent(num, a);
			prev = num;
		}
		for(int i=0;i<rank.length;i++) {
			rank[i] = mp.get(rank[i]);
		}
		return rank;
	}

}
