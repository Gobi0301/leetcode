package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class RemoveTrailingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         String num = sc.next();
        System.out.println(removeZero(num));
	}

	private static String removeZero(String num) {
		// TODO Auto-generated method stub
		int n = num.length()-1;
		for(int i=n;i>0;i--) {
			if(num.charAt(i) != '0') {
				break;
			}
			n--;
		}
		return num.substring(0,n+1);
	}

}
