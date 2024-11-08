package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class FinalPriceWithSpecialDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] prices = {1,2,3,4,5};
      System.out.println(Arrays.toString(finalPrices(prices)));
	}

	private static int[] finalPrices(int[] prices) {
		// TODO Auto-generated method stub
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[j] <= prices[i]) {
					prices[i] = prices[i] - prices[j];
					break;
				}
				
			}
		}
		return prices;
	}

}
