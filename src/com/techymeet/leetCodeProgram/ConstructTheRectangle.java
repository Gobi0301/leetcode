package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ConstructTheRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int area = 122122;
		int[] ans = constructRectangle(area);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] constructRectangle(int area) {
		// TODO Auto-generated method stub
		int[] ans = new int[2];
		int a = (int) Math.sqrt(area);
	  for(int i=a;i>0;i--) {
		  if(area % i == 0) {
			  ans[1] = i;
			  ans[0] = area/i;
			  break;
		  }
	  }
	  return ans;
	}

}
