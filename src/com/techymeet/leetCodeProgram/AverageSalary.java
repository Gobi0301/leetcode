package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class AverageSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(avgSalary(num));

	}

	private static double avgSalary(int[] num) {
		// TODO Auto-generated method stub
		Arrays.sort(num);
		int max = num[0];
		int min = num[num.length-1];
		
		double avg = (max + min) / 2; 
		return avg;
	}

}
