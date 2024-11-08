package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CountGoodTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		int c  = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(countGoodTriplet(arr,a,b,c));
		
		}

	private static int countGoodTriplet(int[] arr, int a, int b, int c) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(Math.abs(arr[i] - arr[j]) <=a && Math.abs(arr[j] - arr[k]) <=b &&  Math.abs(arr[i] - arr[k]) <=c) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
