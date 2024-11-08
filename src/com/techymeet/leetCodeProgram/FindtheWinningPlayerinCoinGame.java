package com.techymeet.leetCodeProgram;

public class FindtheWinningPlayerinCoinGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		int y = 11;
	 String ans = losingPlayer(x,y);
	 System.out.println(ans);

	}

	private static String losingPlayer(int x, int y) {
		// TODO Auto-generated method stub
		   int val1 = 75;
	        int val2 = 10;
	        int alice = 0;
	        int bob = 0;
	      while(x >0 || y >0){
	        alice += val1 + val2;
	        x--;
	        y--;
	        bob += val1+val2;
	        x--;
	        y--;
	        if(alice == 115){
	            return "Alice";
	        }
	        if(bob == 115){
	            return "Bob";
	        }
	        if(x == 0){
	            val1 = 0;
	        }
	        if(y == 0){
	            val2 = 0;
	        }
	      }
	      return "";
	   
	}

}
