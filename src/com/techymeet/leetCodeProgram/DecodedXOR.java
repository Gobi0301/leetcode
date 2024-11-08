package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class DecodedXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = decodeXorArray(arr,first);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] decodeXorArray(int[] arr, int first) {
		// TODO Auto-generated method stub
		int[] ans = new int[arr.length+1];
		ans[0] = first;
		for(int i=0;i<arr.length+1-1;i++) {
			ans[i+1] = arr[i] ^ ans[i];
		}
		return ans;
	}

}
