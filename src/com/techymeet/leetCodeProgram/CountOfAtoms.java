package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CountOfAtoms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String formula = "H20";
       System.out.println(countOfAtoms(formula));
	}

	private static String countOfAtoms(String formula) {
		// TODO Auto-generated method stub
		Stack<Map<String,Integer>> st = new Stack<>();
		st.push(new HashMap<>());
		int len = formula.length();
		
		for(int i=0;i<len;i++) {
			if(formula.charAt(i) == '(') {
				st.push(new HashMap<>());
				i++;
			}else {
				
			}
		}
		
		
		return null;
	}

}
