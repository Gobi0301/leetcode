package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class GoalParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//String command = sc.next();
		String  command = "G()(al)";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<command.length();i++) {
			if(command.charAt(i) == 'G')
				sb.append('G');
			
			else if(command.charAt(i) == '(') {
				if(command.charAt(i+1) == ')') {
					sb.append('o');
					i++;
				}
		}
			
			else {
				sb.append("al");
				i+=2;
			}

	}

}}
