package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DifferenceOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		int arr2[] = new int[n];
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println(findDifference(arr1,arr2));

	}

	private static List<List<Integer>>findDifference(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> ans = new LinkedList<List<Integer>>();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		for(int n1 : arr1) {
			h1.add(n1);
		}
		for(int n2:arr2) {
			h2.add(n2);
		}
		for(int i:h1) {
			if(!h2.contains(i)) {
				l1.add(i);
			}
			}
		for(int j:h2) {
			if(!h1.contains(j)) {
				l2.add(j);
			}
		}
		ans.add(l1);
		ans.add(l2);
		
		return ans;
	}

}
