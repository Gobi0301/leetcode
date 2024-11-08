package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CountPairsDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<arr.length;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    System.out.println(countPairs(arr,k));

	}

	private static int countPairs(int[] arr, int k) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j] && (i*j)%k == 0) {
					count++;
				}
			}
		}
		return count;
	}

}
