package com.techymeet.leetCodeProgram;

public class FindIfArrayCanBeSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {8,4,2,30,15};
		boolean ans = canSortArray(nums);
		System.out.println(ans);

	}

	private static boolean canSortArray(int[] nums) {
		// TODO Auto-generated method stub
		short pmax=0, cmin=0,cmax=0;
		byte pcnt = 0;
		for(int v :nums) {
			byte ccnt = (byte) Integer.bitCount(v);
			if(pcnt == ccnt) {
				cmin = cmin > v ? (short) v : cmin;
				cmax = cmax < v ? (short) v : cmax; 
			}else if(cmin < pmax) {
				return false;
			}else {
				pmax = cmax;
				cmin = cmax = (short)v;
				pcnt = ccnt;
			}
		}
		return cmin >= pmax;
	}

}
