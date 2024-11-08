package com.techymeet.leetCodeProgram;

public class MinimumDeletedStringBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "aababbab";
       int n = minimumDeletions(s);
       System.out.println(n);
	}

	private static int minimumDeletions(String s) {
		// TODO Auto-generated method stub
		int res=0,count=0;
		for(char c:s.toCharArray()) {
			if(c == 'b') {
				count++;
			}else if(count !=0) {
				res++;
				count--;
			}
		}
		return res;
	}

}
