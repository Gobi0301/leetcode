package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class BuyAndSell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(buyandSellprofit(arr));

	}

	private static int buyandSellprofit(int[] arr) {
		// TODO Auto-generated method stub
		if(arr == null || arr.length<= 1) {
			return 0;
		}
		int totalProfit = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1] < arr[i]) {
				totalProfit += arr[i] - arr[i-1];
			}
		}
		return totalProfit;
	}

}
