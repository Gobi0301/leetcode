package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class BuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxProfit(arr));

	}

	private static int maxProfit(int[] arr) {
		// TODO Auto-generated method stub
		int max = Integer.MAX_VALUE;
		int min = 0;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < max) {
				max = arr[i];
			}
			sum = arr[i] - max;
			if(min < sum) {
				min = sum;
			}
		}
		
		return min;
	}

}
