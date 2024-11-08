	package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i] + arr[j] == target) {
				System.out.println( i+"," +j );
			}
		}
		}
		
	}
		
	}


