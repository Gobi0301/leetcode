package com.techymeet.leetCodeProgram;

public class FindKthPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {2,3,4,7,11};
       int k = 5;
       System.out.println(findKthpositive(arr,k));
	}

	private static int findKthpositive(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int low = 0;
		int high = n-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			int missing = arr[mid] - (mid+1);
			if(missing < k) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return high+1+k;
	}

}
