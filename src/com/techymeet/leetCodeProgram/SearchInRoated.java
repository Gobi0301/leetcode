package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SearchInRoated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target ) {
				System.out.println(i);
			}
		
		}
		

	}

}
