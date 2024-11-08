package com.techymeet.leetCodeProgram;

public class CheckifNandItsDoubleExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,2,5,3};
		boolean ans = checkIfExists(arr);
		System.out.println(ans);
	}

	private static boolean checkIfExists(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == (2*arr[j])  && i!=j) {
					return true;
				}
			}
		}
		return false;
	}

}
