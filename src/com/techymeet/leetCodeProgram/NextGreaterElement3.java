package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class NextGreaterElement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findNextGreater(n));
	}

	private static int findNextGreater(int n) {
		// TODO Auto-generated method stub
		String s = String.valueOf(n);
		int[] arr = new int[s.length()];
		int len = s.length();
		
		for(int i=0;i<len;i++) {
			arr[i] = (int) (s.charAt(i) - '0');
		}
		int i = len -1;
		while(i>0 &&arr[i-1] >= arr[i])
			i--;
		
		if(i==0)
			return -1;
		int pivot = i;
		i = len -1;
		while(i>=0 && arr[i] <= arr[pivot-1])
			i--;
		
		int temp = arr[pivot-1];
		arr[pivot-1] = arr[i];
		arr[i] = temp;
		
		i = len -1;
		while(pivot < i) {
			temp = arr[pivot];
			arr[pivot] = arr[i];
			arr[i] = temp;
			
			pivot++;
			i--;
		}	
		long ans = 0;
		for(int a:arr) {
			ans = ans * 10 + a;
		}
		if(ans > Integer.MAX_VALUE)
			return -1;
		
		
		return (int) ans;
	}

}
