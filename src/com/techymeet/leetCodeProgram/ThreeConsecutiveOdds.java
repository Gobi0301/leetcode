package com.techymeet.leetCodeProgram;

public class ThreeConsecutiveOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,34,3,4,5,7,23,12};
		System.out.println(threeConsecutiveOdds(arr));
	}

	private static boolean threeConsecutiveOdds(int[] arr) {
		// TODO Auto-generated method stub
		//int count = 0;
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i] % 2 != 0 && arr[i+1] %2 != 0 && arr[i+2] % 2 != 0 ) {
			return true;
		}
		
	}
		return false;
	}
}
