package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class JumpGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(jumpgame(arr));

	}

	private static int jumpgame(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length == 0) {
		return 0;
		}
		int currReach = 0, i=0,jumps=0,prevReach=0;
		for(int x:arr) {
			currReach = Math.max(currReach, i+x);
			if(currReach >= arr.length-1) {
				return jumps+1;
			}
			if(i == prevReach) {
				jumps++;
				prevReach = currReach;
			}
			i++;
		}
		return jumps;
	}

}
