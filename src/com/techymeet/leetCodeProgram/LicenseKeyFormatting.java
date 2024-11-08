package com.techymeet.leetCodeProgram;

public class LicenseKeyFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "5F3Z-2e-9-w";
       int k  = 4;
       String ans = licenseKeyFormatting(s,k);
       System.out.println(ans);
	}

	private static String licenseKeyFormatting(String s, int k) {
		// TODO Auto-generated method stub
		int n = s.length();
		int cnt = 0;
		String temp = "";
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i) != '-') {
				cnt++;
				temp += s.charAt(i);
			}
		}
		
		int firstDash = cnt % k;
		int c = 0;
		String str = "";
		
		for(int i=0;i<cnt;i++) {
			if(i !=0 && (i==firstDash || c == k)) {
				str += '-';
				str += temp.charAt(i);
				c = 0;
			}
			else {
				str = str + temp.charAt(i);
				c++;
			}
		}
		
		return str.toUpperCase();
	}

}
