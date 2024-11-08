package com.techymeet.leetCodeProgram;



public class DuplicateZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {1,0,2,3,0,4,5,0};
    //   int[] ans = 
    		   duplicateZeros(arr);
      // System.out.println(Arrays.toString(ans));
	}

	private static void duplicateZeros(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] tempArr = new int[arr.length];
		for(int arrIdx = 0,tempIdx=0;arrIdx<tempArr.length;arrIdx++) {
			tempArr[tempIdx] = arr[arrIdx];
			
			if(tempArr[tempIdx++] == 0 && tempIdx < tempArr.length) {
				tempArr[tempIdx++] = 0;
			}
		}
		System.arraycopy(tempArr, 0, arr, 0, arr.length);
	}

}
