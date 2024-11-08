package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(containDuplicate(arr,k));

	}

	private static boolean containDuplicate(int[] arr,int k) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j] && Math.abs(i-j)<=k) {
					
					return true;
				}
			}
		}
		return false;
	}

}
