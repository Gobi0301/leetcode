package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class RingAndRods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(countPairs(str));

	}

	private static int countPairs(String str) {
		// TODO Auto-generated method stub
		int R[] = new int[10];
		int G[] = new int[10];
		int B[] = new int[10];
		int out = 0;
		for(int i=0;i<str.length();i+=2) {
			int index =  str.charAt(i+1) - '0';
			if(str.charAt(i) == 'R') {
				R[index]+=1;
			}
			else if(str.charAt(i) == 'G') {
				G[index]+=1;
			}
			else {
				B[index]+=1;
			}
		}
		for(int i=0;i<=9;i++) {
			if(R[i]>0 && G[i] > 0 && B[i] > 0) {
				out++;
			}
		}
		return out;
	}

}
