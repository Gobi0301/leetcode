package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class KItemsMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numOnes = sc.nextInt();
		int numZeros = sc.nextInt();
		int numNegOnes = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
	
		System.out.println(findKItemsSum(numOnes,numZeros,numNegOnes,k));

	}

	private static int findKItemsSum(int numOnes, int numZeros, int numNegOnes, int k) {
		// TODO Auto-generated method stub
		int[] arr = new int[numOnes+numZeros+numNegOnes];
		int sum = 0;
		int i=0;
		while(numOnes>0) {
			arr[i++] = 1;
			numOnes--;
		}
		while(numZeros>0) {
			arr[i++] = 0;
			numZeros--;
		}
		while(numNegOnes>0) {
			arr[i++] = -1;
			numNegOnes--;
		}
	     i=0;
		while(k>0) {
			sum+=arr[i++];
			k--;
			
		}
		
		return sum;
	}

}
