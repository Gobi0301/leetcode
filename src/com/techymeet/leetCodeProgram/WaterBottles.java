package com.techymeet.leetCodeProgram;

public class WaterBottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numBottles = 9;
		int numExchange = 3;
		System.out.println(numWaterBottle(numBottles,numExchange));

	}

	private static int numWaterBottle(int numBottles, int numExchange) {
		// TODO Auto-generated method stub
		int ans = numBottles;
		while(numBottles >= numExchange) {
			int refillBottle = numBottles / numExchange;
			ans+= refillBottle;
			int emptyBottle = numBottles % numExchange;
			numBottles = refillBottle + emptyBottle;
		}
		return ans;
	}

	
}
