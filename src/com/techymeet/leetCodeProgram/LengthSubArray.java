package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class LengthSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(lengthSubarray(arr));

	}

	private static int  lengthSubarray(int[] arr) {
		// TODO Auto-generated method stub
		/*int sum = 0;
		int total = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					total += arr[i] + arr[j]+arr[k];
				  break;
				}
			break;
			}
			
		}
		total = total + sum + sum;
		return total;*/
		int n = arr.length;
		int[] num = new int[n];
		num[0]  = arr[0];
		for(int i=1;i<n;i++) {
			num[i] = arr[i] + num[i-1];
		}
		int sum = num[n-1];
		for(int i=3;i<=n;i+=2) {
			sum+= num[i-1];
			for(int j=i;j<n;j++) {
				sum+=num[j] - num[j-i];
			}
		}
		return sum;
	}

}
