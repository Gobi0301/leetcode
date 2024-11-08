package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TwoOutThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int[] num1 = new int[a];
		for(int i=0;i<num1.length;i++) {
			num1[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int[] num2 = new int[b];
		for(int i=0;i<num2.length;i++) {
			num2[i] = sc.nextInt();
		}
		int c = sc.nextInt();
		int[] num3 = new int[c];
		for(int i=0;i<num3.length;i++) {
			num3[i] = sc.nextInt();
		}
		System.out.println(twoOutThree(num1,num2,num3));

	}

	private static List<Integer> twoOutThree(int[] num1, int[] num2, int[] num3) {
		// TODO Auto-generated method stub
		HashSet<Integer> ans = new HashSet<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		HashSet<Integer> set3 = new HashSet<Integer>();
		
		for(int x:num1) {
			set1.add(x);
		}
		for(int x: num2) {
			set2.add(x);
		}
		for(int x: num3) {
			set3.add(x);
		}
		for(int p:set1) {
			if(set2.contains(p)) {
			ans.add(p);}
			else if(set3.contains(p)) {
			ans.add(p);}
		}
		for(int p:set2) {
			if(set3.contains(p)) {
				ans.add(p);
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int p:ans) {
			list.add(p);
		}
		return list;
	}

}
