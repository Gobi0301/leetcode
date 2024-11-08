package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class MaximumPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
        	arr[i] = sc.nextInt();
        }
        System.out.println(max(arr));
	}

	private static int max(int[] arr) {
		// TODO Auto-generated method stub
		int positive =  0;
		int negative = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > 0) {
				positive++;
			}
			else if(arr[i] < 0){
				negative++;
			}
		}
		if(positive > negative) {
			return positive;
		}
		else {
			return negative;
		}
	}

}
