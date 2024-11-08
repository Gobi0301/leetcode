package com.techymeet.leetCodeProgram;

public class StoneGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] piles = {5,3,4,5};
      boolean ans = stoneGame(piles);
      System.out.println(ans);
	}

	private static boolean stoneGame(int[] piles) {
		// TODO Auto-generated method stub
		int alice = 0;
		for(int i=0;i<piles.length;i+=2) {
			alice +=piles[i];
		}
		int bob = 0;
		for(int i=1;i<piles.length;i+=2) {
			bob+=piles[i];
		}
		
		int alice1 = 0;
		for(int i=piles.length-1;i>=0;i-=2) {
			alice1 +=piles[i];
		}
		int bob1 = 0;
		for(int i=piles.length-2;i>=0;i-=2) {
			bob1+=piles[i];
		}
		
		return alice > bob || alice1 > bob1;
	}

}
