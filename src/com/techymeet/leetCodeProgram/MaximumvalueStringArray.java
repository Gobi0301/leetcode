package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class MaximumvalueStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	//	int n = sc.nextInt();
		String[] s = {"1","01","001","0001"};
		/*for(int i=0;i<s.length;i++) {
			s[i] = sc.nextLine();
		}*/
		int[] ans = new int[s.length];
	for(int  i=0;i<s.length;i++) {
		ans[i] = s[i].length();
	}
	int res = 0;
	for(int i=0;i<ans.length;i++) {
		res = Math.max(res, ans[i]);
	}
        System.out.println(res);
	}

}
