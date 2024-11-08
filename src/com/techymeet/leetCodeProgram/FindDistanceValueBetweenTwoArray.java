package com.techymeet.leetCodeProgram;

public class FindDistanceValueBetweenTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1 = {1,4,2,3};
        int[] arr2 = {-4,-3,6,10,20,30};
        int d = 3;
        int ans = findTheDistancevalue(arr1,arr2,d);
        System.out.println(ans);
	}

	private static int findTheDistancevalue(int[] arr1, int[] arr2, int d) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(Math.abs(arr1[i]-arr2[j])<=d) {
					count++;
					break;
				}
			}
		}
		return arr1.length-count;
	}

}
