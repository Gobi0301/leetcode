package com.techymeet.leetCodeProgram;

public class DayOfYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String date = "2019-02-10";
       System.out.println(dayOfyear(date));
	}

	private static int dayOfyear(String date) {
		// TODO Auto-generated method stub
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int year = Integer.parseInt(date.substring(0,4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8));
		int sum = 0;
		
		while(month >= 1) {
			if(day != 0) {
				sum+=day;
				day = 0;
				month--;
			}
			for(int i=month-1;i>=0;i--) {
				if(i == 1) {
					if(year % 4 == 0 &&(year % 100 != 0 || year % 400 == 0)) {
						sum+=60;
					return sum;
				}else {
					sum+=59;
					return sum;
				}
			}
			else{
				sum+=days[i];
			}
			}
			month--;
		}
		return sum;
	}

}
