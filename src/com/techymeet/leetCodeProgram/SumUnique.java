package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SumUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sumUnique(arr));

	}

	private static int sumUnique(int[] arr) {
		// TODO Auto-generated method stub
	/*int sum = 0;
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			h.add(arr[i]);
		}
		
		for(int i : h) {
			sum+=i;
		}
		return sum;*/
		int sum = 0;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count = 0;
			for(int j=0;j<arr.length;j++) {
				if(i != j && arr[i] == arr[j]) {	
					count++;
					break;
				}
			}
			if( count == 0) {
				sum+=arr[i];
			}
		}
		return sum;
		
	}

}
