package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SumMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumMultiple(n));

	}

	private static int sumMultiple(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
	for(int i=1;i<=n;i++) {
		if(i%3 == 0) {
			sum += i;
		}
		else if(i%5 == 0) {
			sum +=i;
		}
		else if(i%7 ==0) {
			sum+=i;
		}
	}
		return sum;
	}

}
