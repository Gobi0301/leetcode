package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class countQuadraples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(countquadraple(arr));

	}

	private static int countquadraple(int[] arr) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					for(int l = k+1;l<arr.length;l++) {
						if(arr[i] + arr[j] + arr[k] == arr[l]) {
							count++;
						}
					}
				}
			}
		}
		
		return count;
	}

}
