package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelfDividingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
	    List<Integer> list = findSelfDivide(left,right);
	    System.out.println(list);

	}

	private static List<Integer> findSelfDivide(int left, int right) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=left;i<=right;i++) {
			int num = i;
			int count = 0;
			while(num >0) {
				int r = num % 10;
				if(r == 0) {
					count = 0;
					break;
				}
				else if(i% r ==0) {
					count++;
					num = num /10;
				}
				else {
					count = 0;
					break;
				}
			}
			if(count>0) {
				list.add(i);
			}
		}
		
		return list;
	}

}
