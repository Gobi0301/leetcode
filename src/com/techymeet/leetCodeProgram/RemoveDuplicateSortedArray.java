package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(duplicatearray(arr));

	}

	private static int duplicatearray(int[] arr) {
		// TODO Auto-generated method stub
		/*Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int len = set.size();
		System.out.println(set);
		return len;*/
		int j = 1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		return j;
	}

	
}
