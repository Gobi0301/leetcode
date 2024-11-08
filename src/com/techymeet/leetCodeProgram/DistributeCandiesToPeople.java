package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class DistributeCandiesToPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int candies = 7;
      int num_people = 4;
      int[] res = distributeCandies(candies,num_people);
      System.out.println(Arrays.toString(res));
	}

	private static int[] distributeCandies(int candies, int num_people) {
		// TODO Auto-generated method stub
		int[] ans = new int[num_people];
		int i = 1;
		int index = 0;
		while(candies != 0) {
	     index = (index == num_people) ? 0:index;
	     if(candies - i >=0) {
	    	 ans[index++] +=i;
	    	 candies = candies -i;
	    	 i++;
	     }
	     else {
	    	 ans[index++] += candies;
	    	 break;
	     }
		}
		return ans;
	}

}
