package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class DefangingIp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = str.replaceAll("\\.", "[.]");
		System.out.println(res);
	}

}
