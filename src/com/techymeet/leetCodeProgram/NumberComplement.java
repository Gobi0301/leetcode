package com.techymeet.leetCodeProgram;

public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 5;
        //String ans = findComplement(num);
        //System.out.println(ans);
        String ans = Integer.toBinaryString(~num);
        System.out.println(ans);
        int res = Integer.highestOneBit(num)-1;
        System.out.println(res);
	}
	

	/*private static String findComplement(int num) {
		// TODO Auto-generated method stub
	
		//int ans = ~num & (Integer.highestOneBit(num) -1);
		return Integer.toBinaryString(~num);
	}*/

}
