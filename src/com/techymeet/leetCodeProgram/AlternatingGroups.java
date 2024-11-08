package com.techymeet.leetCodeProgram;

public class AlternatingGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] colors = {0,1,0,0,1};
       System.out.println(numberOfAlternate(colors));
	}

	private static int numberOfAlternate(int[] colors) {
		// TODO Auto-generated method stub
		int n= colors.length;
		int count = 0;
		if(colors[n-1] != colors[0] && colors[0] != colors[1]) {
			count++;
		}
		if(colors[n-1] != colors[0] && colors[n-1] != colors[n-2]) {
			count++;
		}
		for(int i=1;i<n-1;i++) {
			if(colors[i] != colors[i-1] && colors[i] != colors[i+1]) {
				count++;
			}
		}
		return count;
	}

}
