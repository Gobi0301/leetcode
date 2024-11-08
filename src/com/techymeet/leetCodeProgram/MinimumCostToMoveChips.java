package com.techymeet.leetCodeProgram;

public class MinimumCostToMoveChips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] position = {2,2,2,3,3};
        System.out.println(minCostTomoveChips(position));
	}

	private static int minCostTomoveChips(int[] position) {
		// TODO Auto-generated method stub
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i:position) {
			if(i%2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		return Math.min(evenCount, oddCount);
	}

}
