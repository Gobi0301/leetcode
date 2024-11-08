package com.techymeet.leetCodeProgram;

public class SumOfDigitofStringAfterConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "iiii";
		int k = 1;
		int ans = getLucky(s,k);
		System.out.println(ans);
	}

	private static int getLucky(String s, int k) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(char x:s.toCharArray()) {
			sb.append(x - 'a'+1);
		}
		while(k > 0) {
			int temp = 0;
			for(char x:sb.toString().toCharArray()) {
				temp+= x - '0';
			}
			sb = new StringBuilder(String.valueOf(temp));
			k--;
		}
		
		return Integer.parseInt(sb.toString());
	}

}
