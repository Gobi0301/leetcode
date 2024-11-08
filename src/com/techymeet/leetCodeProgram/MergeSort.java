package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*int a = sc.nextInt();//size
		int[] num1 = new int[a];
		for(int i=0;i<num1.length;i++) {
			num1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int b = sc.nextInt();
		int[] num2 = new int[b];
        for(int i=0;i<num2.length;i++) {
        	num2[i] = sc.nextInt();
        }
        int n = sc.nextInt();*/
		int[] num1 = {1,2,3,0,0,0};
		int[] num2 = {2,5,6};
		int m = 3;
		int n = 3;
        merge(num1,m,num2,n);
	}

	private static void merge(int[] num1, int m, int[] num2, int n) {
		// TODO Auto-generated method stub
		
		for(int j=0,i=m; j<n;j++) {
		num1[i] = num2[j];
		i++;
		}
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
	}

}
