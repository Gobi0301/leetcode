package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		int[] ans = sortArray(num);
		System.out.println(Arrays.toString(ans));

	}

	private static int[] sortArray(int[] num) {
		// TODO Auto-generated method stub
		int i=0,j=num.length-1;
		while(i<j) {
			while(i<j && num[i] % 2 == 0) 
				i++;
				while(i<j && num[j] % 2 == 1) 
					j--;
				
			
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
		
		
		return num;
				}

}
