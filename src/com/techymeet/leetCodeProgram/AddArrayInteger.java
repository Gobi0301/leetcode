package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddArrayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}*/
		int[] num = {9,9,9,9,9,9,9,9,9,9,9};
		int k  = 1;
		//int k = sc.nextInt();
		List<Integer> list = findAddArr(num,k);
		System.out.println(list);
	}

	private static List<Integer> findAddArr(int[] num, int k) {
		// TODO Auto-generated method stub
		/*String ans = "";
		for(int i=0;i<num.length;i++) {
			ans+=num[i];
		}
		Long l = new Long(ans);
		//int j =  Integer.valueOf(ans);
		long sum = l + k;
	
		List<Integer> list = new ArrayList<>();
		while(sum!=0) {
			long remain =  sum %10;
			list.add((int)remain);
			sum/=10;
		}
		Collections.reverse(list);
		return list;*/
		List<Integer> list = new LinkedList<>();
		for(int i=num.length-1;i>=0;i--) {
			list.add(0, (num[i] + k)% 10);
			k = (k + num[i]) / 10;
		}
		while(k > 0) {
			list.add(0,k%10);
			k = k / 10;
		}
		return list;
	}

}
