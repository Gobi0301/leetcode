package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ConcatenationArray {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.addAll((Collection<? extends Integer>) list.clone());
		System.out.println(list);*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	int num[] = new int[n];
	for(int i=0;i<num.length;i++) {
		num[i] = sc.nextInt();
	}
	int[] ans = getConcatenation(num);
	for(int a : ans) {
		System.out.println(a);
	}
		
		

	}

	private static int[] getConcatenation(int[] num) {
		int length = num.length;
		int[] ans = new int[length*2];
		for(int i=0;i<ans.length;i++) {
			
				if(i < length) {
					ans[i] = num[i];
				}
				else {
					ans[i] = num[i-length];
				}
		}
		
		return ans;
		// TODO Auto-generated method stub
		
	}

}
