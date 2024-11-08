package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class FrequencySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(frequencySort(arr));

	}

	private static int[] frequencySort(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			alist.add(arr[i]);
		}
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		int[] k = new int[t2.size()];
		int[] c = new int[t2.size()];
		int x = 0;
		for(int i:t2) {
			c[x] = i;
			k[x] = Collections.frequency(alist, i);
			x++;
		}
		for(int i=0;i<k.length;i++) {
			for(int j=i+1;j<k.length;j++) {
				if(k[i] >= k[j]) {
					int t = k[i];
					k[i] = k[j];
					k[j] = t;
					int t1 = c[i];
					c[i] = c[j];
					c[j] = t1;
				}
			}
		}
		int ans[] = new int[arr.length];
		int r = 0;
		for(int i=0;i<k.length;i++) {
			int l = k[i];
			while(l>0) {
				ans[r] = c[i];
				r++;
				l--;
			}
		}
		
		return ans;
	}

}
