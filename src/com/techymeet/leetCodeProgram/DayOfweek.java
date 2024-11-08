package com.techymeet.leetCodeProgram;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DayOfweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		System.out.println(findDay(day,month,year));

	}

	private static String findDay(int day, int month, int year) {
		// TODO Auto-generated method stub
		 String[] s = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		 int[] m = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		 int d = day;
		 for(int i=1;i<month;i++) {
			 d += m[i];
		 }
		 if(isLeapyear(year) && month > 2)
			 d++;
		 year--;
		 d+=(year + (year/4) - (year / 100) + (year /400)) % 7;
		 return s[(d) % 7];
	}

	private static boolean isLeapyear(int year) {
		// TODO Auto-generated method stub
		return (year % 400 == 0 || ((year % 100 !=0) && (year %4 == 0)));
	}

}
