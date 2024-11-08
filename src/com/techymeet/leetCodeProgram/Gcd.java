package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(commonDivisor(arr));

	}

	private static int commonDivisor(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int gcd = 1;
		for(int i=1;i<=arr[0];i++) {
			if(arr[0] % i == 0 && arr[arr.length-1] % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

}
