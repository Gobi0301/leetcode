package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class NthTribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findnthtribonaci(n));

	}

	private static int findnthtribonaci(int n) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=1,n4;
		for(int i=2;i<n;i++) {
			n4= n1+n2+n3;
			n1 = n2;
			n2 = n3;
			n3 = n4;
		}
		return n3;
	}

}
