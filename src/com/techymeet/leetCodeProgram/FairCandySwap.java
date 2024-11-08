package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class FairCandySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aliceSizes = {1,1};
		int[] bobSizes  = {2,2};
          System.out.println(Arrays.toString(findCandy(aliceSizes,bobSizes)));
	}

	private static int[] findCandy(int[] aliceSizes, int[] bobSizes) {
		// TODO Auto-generated method stub
		int aliceTotal = 0;
		int bobTotal = 0;
		for(int i:aliceSizes) {
			aliceTotal += i;
		}
		for(int i:bobSizes) {
			bobTotal += i;
		}
		for(int i=0;i<aliceSizes.length;i++) {
			for(int j=0;j<bobSizes.length;j++) {
				if((aliceTotal - aliceSizes[i] + bobSizes[j]) == (bobTotal - bobSizes[j] + aliceSizes[i]) ) {
					return new int[] {aliceSizes[i],bobSizes[j]};
				}
			}
		}
		return new int[0];
	}

}
