package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithGreatest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int candies = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		List<Boolean> list = kidsWithcandies(arr,candies);
      System.out.println(list);
	}

	private static List<Boolean> kidsWithcandies(int[] arr, int candies) {
		// TODO Auto-generated method stub
		List<Boolean> list = new ArrayList<>();
		int max = 0;
		for(int i: arr) {
			max = Math.max(max, i);
		}
		for(int candy: arr) {
			if(candy + candies >= max) {
				list.add(true);
			}
			else {
				list.add(false);
			}
		}
		return list;
	}

}
