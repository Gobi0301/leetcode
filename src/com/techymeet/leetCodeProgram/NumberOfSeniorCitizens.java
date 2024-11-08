package com.techymeet.leetCodeProgram;

public class NumberOfSeniorCitizens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] details = {"1313579440F2036","2921522980M5644"};
       System.out.println(countSeniors(details));
	}

	private static int countSeniors(String[] details) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<details.length;i++) {
			String s = details[i];
			String str = s.substring(11, 13);
			int num  = Integer.parseInt(str);
			if(num > 60) {
				count++;
			}
		}
		return count;
	}

}
