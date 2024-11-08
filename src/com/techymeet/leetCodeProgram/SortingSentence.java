package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SortingSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		String s = sc.nextLine();
		String str = sortSentence(s);
		System.out.println(str);

	}

	private static String sortSentence(String s) {
		// TODO Auto-generated method stub
	  String[] arr  = s.split(" ");
	  int[] num = new int[arr.length];
	  for(int i=0;i<arr.length;i++) {
		 int len = arr[i].length();
		 num[i] = arr[i].charAt(len-1);
		 arr[i] = arr[i].substring(0, len-1);
	  }
	  for(int i=0;i<num.length;i++) {
		  for(int j=i+1;j<num.length;j++) {
			  if(num[i] > num[j]) {
				  int temp = num[i];
				  num[i] = num[j];
				  num[j] = temp;
				  String temp1 = arr[i];
				  arr[i] = arr[j];
				  arr[j] = temp1;
			  }
		  }
	  }
		StringBuilder sb =  new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i] + " ");
		}
		return sb.toString().trim();
	}

}
