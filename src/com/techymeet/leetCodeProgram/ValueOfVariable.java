package com.techymeet.leetCodeProgram;


import java.util.Scanner;

public class ValueOfVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		/*ArrayList<String> list = new ArrayList<String>();
		list.add(sc.nextLine());*/
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0;i<str.length;i++) {
			str[i] = sc.next();
		}
		int x = valueOperation(str);
		System.out.println(x);
		

	}

	private static int valueOperation(String[] str) {
		// TODO Auto-generated method stub
		int x = 0;
		for(int i=0;i<str.length;i++) {
			String s = str[i];
			if(s.charAt(1) == '-') {
				x--;
			}
			else {
				x++;
			}
		}
		return x;
	
	}

}
