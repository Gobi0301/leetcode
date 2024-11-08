package com.techymeet.leetCodeProgram;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String str =  sc.next();
		System.out.println(isValid(str));

	}

	private static boolean isValid(String str) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		for(char c: str.toCharArray()) {
			if(c == '(') {
				stack.push(')');
			}
			else if(c == '{') {
				stack.push('}');
			}
			else if(c =='[') {
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop() !=c) {
				return false;
			}
		}
		return stack.isEmpty();
	}

}
