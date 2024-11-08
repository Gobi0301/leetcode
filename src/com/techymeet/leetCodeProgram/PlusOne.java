package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = plusOne(arr);
		System.out.println(Arrays.toString(res));

	}

	private static int[] plusOne(int[] arr) {
		// TODO Auto-generated method stub
		/*StringBuilder sb = new StringBuilder();
		int n = 0;
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		String s = sb.toString();
		int num = Integer.parseInt(s);
		num = num + 1;
	    
		int j = n;
		while(num > 0) {
			int remain = num % 10;
		     arr[j--] = remain; 
		     num /=10;
		}
		
		return arr;*/
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] < 9) {
				arr[i]++;
			arr[i]	 = Integer.MAX_VALUE;
				return arr;
			}
			arr[i] = 0;
		}
		arr = new int[arr.length+1];
		arr[0] = 1;
		return arr;
		
	}

}
