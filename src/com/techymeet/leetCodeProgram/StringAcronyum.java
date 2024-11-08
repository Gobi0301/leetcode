package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class StringAcronyum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("alice");
		list.add("bob");
		list.add("charlie");
		/*list.add("an");
		list.add("apple");*/
		String s = "abc";
		String x1 = " ";
		for(String x:list) {
		x1 += x.substring(0,1);
		}
		
		if(x1.equalsIgnoreCase(s)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
