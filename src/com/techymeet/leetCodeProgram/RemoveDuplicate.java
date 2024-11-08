package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(removeDuplicateSort(arr));

	}

	private static int removeDuplicateSort(int[] arr) {
		// TODO Auto-generated method stub
	  
	     int count = 1,i=1;
	     for(int j=1;j<arr.length;j++) {
	    	 if(count<2 && arr[j] == arr[j-1]) {
	    		 arr[i] = arr[j];
	    		 count++;
	    		 i++;
	    	 }
	    	 else if(arr[j] != arr[j-1]) {
	    		 count = 1;
	    		 arr[i] = arr[j];
	    		 i++;
	    	 }
	     }
		
		return i;
	}

}
