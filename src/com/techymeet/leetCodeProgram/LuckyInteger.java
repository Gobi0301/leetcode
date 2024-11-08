package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class LuckyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
        	arr[i] = sc.nextInt();
        }
        System.out.println(luckyInteger(arr));
	}

	private static int luckyInteger(int[] arr) {
		// TODO Auto-generated method stub
		int temp[] = new int[arr.length * 2];
		for(int i:arr) {
			temp[i]++;
		}
		int ans = -1;
		for(int i=1;i<temp.length;i++) {
			if(i == temp[i]) {
				ans = i;
			}
		}
		return ans ;
	}

}
