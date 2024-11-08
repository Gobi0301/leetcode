package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(happyNumber(n));

	}

	private static boolean happyNumber(int n) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		while(n!=1 && !set.contains(n)) {
			set.add(n);
		
		int sum = 0;
		while(n!=0) {
		  int  remainder = n%10;
		  sum += remainder * remainder;
			n /= 10;
			
		}
		n = sum;
	
		}
		
		
		return n==1;
	}

}
