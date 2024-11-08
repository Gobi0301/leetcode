package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class DelayedArrivalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arrivalTime = sc.nextInt();
		int delayedTime = sc.nextInt();
		System.out.println(CalculateDelay(arrivalTime,delayedTime));

	}

	private static int CalculateDelay(int arrivalTime, int delayedTime) {
		// TODO Auto-generated method stub
		return (arrivalTime + delayedTime) %24;
	}

}
