package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveOneElement {
//RemoveOneElement To Make a Array Strictly increasing.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(removeElement(arr));
		
	}

private static boolean removeElement(int[] arr) {
	// TODO Auto-generated method stub
	int before = arr[0];
	int temp = 0;
	for(int i=1;i<arr.length;i++) {
		if(arr[i] <= before) {
			if(++temp == 2) 
				return false;
			if(i== 1 || arr[i] > arr[i-2]) 
				before = arr[i];
			
		}
		else {
			before = arr[i];
		}
	}
	
	
	return true;
}

}
