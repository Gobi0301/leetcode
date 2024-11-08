package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println((findmissingNum(arr)));

	}

	private static int findmissingNum(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		Arrays.sort(arr);
		int[] ans = new int[n];
		for(int i=0;i<ans.length;i++) {
			ans[i] = i;
		}
		for(int i=0;i<n;i++) {
			if(ans[i] == arr[i])
				continue;
			else
				return ans[i];
		}
		return n;
	}

}
