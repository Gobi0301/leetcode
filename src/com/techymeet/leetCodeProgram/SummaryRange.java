package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummaryRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<num.length;i++) {
        	num[i] = sc.nextInt();
        }
        System.out.println(Range(num));
	}

	private static List<String> Range(int[] num) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<num.length;i++) {
		int start = num[i];
		while(i+1<num.length && num[i]+1 == num[i+1]) 
			i++;
			if(start!=num[i]) {
				list.add(""+start+"->"+num[i]);
			}
			else {
				list.add(""+start);
			}
		}
			
		return list;
	}

}
