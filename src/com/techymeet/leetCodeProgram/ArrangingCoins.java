package com.techymeet.leetCodeProgram;

public class ArrangingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n  = 8;
        System.out.println(arrangeCoin(n));
	}

	private static int arrangeCoin(int n) {
		// TODO Auto-generated method stub
		int row = 0;
	    while(n > row) {
	    	row++;
	    	n = n- row;
	    }
		return row;
	}

}
