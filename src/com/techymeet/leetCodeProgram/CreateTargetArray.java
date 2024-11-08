package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreateTargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
		}
		int[] index = new int[n];
		for(int i=0;i<index.length;i++) {
			index[i] = sc.nextInt();
		}
		int[] ans = createtargetArray(arr,index);
		System.out.println(Arrays.toString(ans));
	}

	

	private static int[] createtargetArray(int[] arr, int[] index) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			list.add(index[i], arr[i]);
		}
		for(int i=0;i<list.size();i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

}
