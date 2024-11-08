package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElementTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num1[] = new int[n];
		for(int i=0;i<n;i++) {
			num1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] num2 = new int[m];
		for(int i=0;i<m;i++) {
			num2[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(findCommonElemnet(num1,num2)));

	}

	private static int[] findCommonElemnet(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num2.length;j++) {
				if(num1[i] == num2[j]) {
					count1++;
					break;
				}
			}
		}
		for(int i=0;i<num2.length;i++) {
			for(int j=0;j<num1.length;j++) {
				if(num2[i] == num1[j]) {
					count2++;
					break;
				}
			}
		}
	int ans[] = new int[2];
	ans[0] = count1;
	ans[1] = count2;
		
		return ans;
	}

}
