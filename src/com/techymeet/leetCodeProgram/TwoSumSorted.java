package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(Arrays.toString(findTwoSum(numbers,target)));

	}

	private static int[] findTwoSum(int[] numbers, int target) {
		// TODO Auto-generated method stub
		int len = numbers.length-1;
		int i = 0;
		while(numbers[i] + numbers[len] != target) {
			if(numbers[i] + numbers[len] < target) {
				i++;
			}
			else {
				len--;
			}
		}
		return new int[] {i+1,len+1};
	}

}
