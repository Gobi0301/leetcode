package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class XOROpeartion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = sc.nextInt();
		System.out.println(xorOperation(n,start));

	}

	private static int xorOperation(int n, int start) {
		// TODO Auto-generated method stub
		int nums[] = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = start + 2 * i;
		}
		int xor = 0;
		for(int i=0;i<n;i++) {
			xor ^= nums[i];
		}
		return xor;
	}

}
