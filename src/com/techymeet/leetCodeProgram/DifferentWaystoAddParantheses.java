package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaystoAddParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String expression = "2-1-1";
        List<Integer> res = diffWaysToCompute(expression);
        System.out.println(res);
	}

	private static List<Integer> diffWaysToCompute(String expression) {
		// TODO Auto-generated method stub
		List<Integer> res = new ArrayList<>();
		for(int i=0;i<expression.length();i++) {
			char c = expression.charAt(i);
			
			if( c == '-'|| c== '+' || c == '*') {
				List<Integer> s1 = diffWaysToCompute(expression.substring(0,i));
				List<Integer> s2 = diffWaysToCompute(expression.substring(i+1));
				
				for(int a:s1) {
					for(int b:s2) {
						if(c == '+') res.add(a+b);
						else if(c == '-') res.add(a-b);
						else if(c == '*') res.add(a*b);
					}
				}
			}
			
		}
		if(res.isEmpty()) res.add(Integer.parseInt(expression));
		
		return res;
	}

}
