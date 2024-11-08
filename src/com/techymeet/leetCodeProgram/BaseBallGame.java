package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseBallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] operations = {"5","-2","4","C","D","9","+","+"};
       System.out.println(calPoints(operations));
	}

	private static int calPoints(String[] operations) {
		// TODO Auto-generated method stub
	/*	Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<operations.length;i++) {
			String s  = operations[i];
			if(s.equals("C")) {
				st.pop();
			}
			else if(s.equals("D")) {
				st.push( 2 * st.peek());
			}else if(s.equals("+")) {
				st.push(st.peek() + st.get(st.size()-2));
			}else {
				st.push(Integer.parseInt(s));
			}
		}*/
	int[] score = new int[operations.length];
		int size = 0;
		for(String s :operations) {
			if(s.equals("C")) {
				score[size-1] = 0;
				size  = size-2;
				//size--;
			}else if(s.equals("D")) {
				score[size] = 2 * score[size-1];
				
 			}else if(s.equals("+")) {
 				score[size] = score[size-1] + score[size-2];
 			
 			}else {
 				score[size] = Integer.parseInt(s);
 				
 			}
			size++;
		}
		
		int sum = 0;
		int[] ans = new int[score.length];
		for(int i=0;i<ans.length;i++) {
			sum+=score[i];
		}
		/*int sum = 0;
		for(int i :st) {
			sum+=i;
		}*/
		return sum;
	}

}
