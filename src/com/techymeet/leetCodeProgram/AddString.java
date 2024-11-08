package com.techymeet.leetCodeProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class AddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		System.out.println(findString(num1,num2));
	}

	private static String findString(String num1,String num2) {
		// TODO Auto-generated method stub
		BigInteger sum;
		BigInteger s1 = new BigInteger(num1);
		BigInteger s2 = new BigInteger(num2);
	  sum = s1.add(s2);
		
	
        return sum.toString();
	}

}
