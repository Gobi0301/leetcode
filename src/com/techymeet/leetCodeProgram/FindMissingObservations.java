package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class FindMissingObservations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] rolls = {3,2,4,3};
		int mean = 4;
		int n = 2;
		int[] ans = missingRolls(rolls,mean,n);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] missingRolls(int[] rolls, int mean, int n) {
		// TODO Auto-generated method stub
		int m = rolls.length;
		int totalSum = mean * (n+m);
		int observedSum = 0;
		
		for(int roll:rolls) {
			observedSum+=roll;
		}
		
		int missingSum = totalSum - observedSum;
		
		if(missingSum < n || missingSum > 6 * n) {
			return new int[0];
		}
		
		int quotient = missingSum/n;
		int remainder = missingSum % n;
		int[] res = new int[n];
		Arrays.fill(res, quotient);
		for(int i=0;i<remainder;i++) {
			res[i]++;
		}
		return res;
	}

}
