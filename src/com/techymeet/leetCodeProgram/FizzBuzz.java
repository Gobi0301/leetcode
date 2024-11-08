package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = fizzBuzz(n);
		System.out.println(list);

	}

	private static List<String> fizzBuzz(int n) {
		// TODO Auto-generated method stub
	   List<String> list = new ArrayList<String>();
	   for(int i=1;i<=n;i++) {
		   if(i%3==0 && i%5==0) {
			   list.add("FizzBuzz");
		   }
		   else if(i%3==0) {
			   list.add("Fizz");
		   }
		   else if(i%5==0) {
			   list.add("Buzz");
		   }
		   else {
			   String s = String.valueOf(i);
			   list.add(s);
		   }
	   }
		return list;
	}

}
