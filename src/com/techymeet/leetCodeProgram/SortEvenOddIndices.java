package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortEvenOddIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(findOddEven(arr)));
	}

	private static int[] findOddEven(int[] arr) {
		// TODO Auto-generated method stub
		int[] ans = new int[arr.length];
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(i%2 == 0) {
				even.add(arr[i]);
			}
			else {
				odd.add(arr[i]);
			}
		}
		Collections.sort(even);
		Collections.sort(odd);
		Collections.reverse(odd);
		int x = 0,y=0;
		for(int i=0;i<ans.length;i++) {
			if(i%2==0)
				ans[i] = even.get(x++);
			else
				ans[i] = odd.get(y++);
		}
		
		
		return ans;
	}

}
