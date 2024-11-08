package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class kBeautyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(findKbeautyNum(num,k));
	}

	private static int findKbeautyNum(int num, int k) {
		// TODO Auto-generated method stub
		String s  = Integer.toString(num);
		String str="";
		int count = 0;
		int n = 0;
		for(int i=0;i<=s.length()-k;i++) {
			str = s.substring(i,i+k);
			n = Integer.parseInt(str);
			if(n!=0 && num%n == 0) {
				count++;
			}
		}
		return count;
	}

}
