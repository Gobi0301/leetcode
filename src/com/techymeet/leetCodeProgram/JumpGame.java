package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(canJump(arr));

	}

	private static boolean canJump(int[] arr) {
		// TODO Auto-generated method stub
		int currEnd = 0;
		int currfar = 0;
		int length = arr.length-1;
		for(int i=0;i<length;i++) {
			currfar = Math.max(currfar, i+arr[i]);
			
			if(i == currEnd) {
				if(currfar>currEnd) {
					currEnd = currfar;
				}
				else {
					return false;
				}
			}
		}
		return true;
	}

}
