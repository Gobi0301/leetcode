package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Distributecandies1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findCandies(arr));

	}

	private static int findCandies(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		int min = Math.min(set.size(), arr.length/2);
		return min;
	}

}
