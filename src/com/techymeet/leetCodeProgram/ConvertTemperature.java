package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double celsius = sc.nextDouble();
		double[] res = convertTemp(celsius);
System.out.println(Arrays.toString(res));
	}

	private static double[] convertTemp(double celsius) {
		// TODO Auto-generated method stub
		double[] arr = new double[2];
		arr[0] = celsius + 273.15 ;
		arr[1] = (celsius * 1.80) + 32.00;
		
		return arr;
	}

}
