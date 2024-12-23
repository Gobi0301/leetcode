package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MinimumNoMovesToSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seats = {4,1,5,9};
		int[] students = {1,3,2,6};
        System.out.println(minMovesToSeat(seats,students));
	}

	private static int minMovesToSeat(int[] seats, int[] students) {
		// TODO Auto-generated method stub
		Arrays.sort(seats);
		Arrays.sort(students);
		int count = 0;
		for(int i=0;i<seats.length;i++) {
				count+= Math.abs(students[i] - seats[i]); 
			}
		return count;
	}

}
