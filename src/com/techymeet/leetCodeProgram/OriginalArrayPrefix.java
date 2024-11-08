package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class OriginalArrayPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pref = {5,2,0,3,1};
      System.out.println(Arrays.toString(findArray(pref)));
	}

	private static int[] findArray(int[] pref) {
		// TODO Auto-generated method stub
		// int count = 0;
		 int[] arr = new int[pref.length];
		 arr[0] = pref[0];
	        for(int i=1;i<pref.length;i++){
	           
	            arr[i] = pref[i-1] ^ pref[i];
	        }
	        return arr;
		
	}

}
