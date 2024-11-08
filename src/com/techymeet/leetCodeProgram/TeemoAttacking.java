package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class TeemoAttacking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        for(int i=0;i<time.length;i++) {
        	time[i] = sc.nextInt();
        }
        int duration = sc.nextInt();
        System.out.println(findPoisonedDuration(time,duration));
	}

	private static int findPoisonedDuration(int[] time, int duration) {
		// TODO Auto-generated method stub
		int res = duration;
		int prev  = time[0];
		for(int i=1;i<time.length;i++) {
			if(time[i] <= time[i-1] + duration	) {
				res+= time[i] - time[i-1];
			}
			else {
				res+=duration;
			}
		}
		
		return res;
	}

}
