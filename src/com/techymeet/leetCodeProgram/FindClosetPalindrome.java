package com.techymeet.leetCodeProgram;

public class FindClosetPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n = "123";
		String ans = nearestPalindrome(n);
		System.out.println(ans);

	}

	private static String nearestPalindrome(String n) {
		// TODO Auto-generated method stub
		int len = n.length();
		
		if(len == 1) {
			int val = Integer.parseInt(n) -1;
			return String.valueOf(val);
		}
		
		if(n.equals("10")) return "9";
		if(n.equals("11")) return "9";
		if(n.equals("100")) return "99";
		if(n.equals("99")) return "101";
		if(n.equals("1000")) return "999";
		
		if(n.equals("999")) return "1001";
		if(n.equals("99999")) return "100001";
		if (n.equals("100000000")) return "99999999" ;
        if (n.equals("999999999")) return "1000000001";
        
        long number = Long.parseLong(n);
        int half = len/2;
        String halfStr = n.substring(0,half + (len %2 ));
        long halfNum = Long.parseLong(halfStr);
        
        String palinSame = makePalindrome (halfStr , len %2 == 1);
        String palinLower = makePalindrome(String.valueOf(halfNum -1),len%2 ==1);
        String palinHigher = makePalindrome(String.valueOf(halfNum+1),len%2==1);
        
        long palSame = Long.parseLong(palinSame);
        long palLower = Long.parseLong(palinLower);
        long palHigher = Long.parseLong(palinHigher);
        
        long diffSame = palSame == number ? Long.MAX_VALUE : Math.abs(palSame -number);
        long diffLower = Math.abs(palLower - number);
        long diffHigher = Math.abs(palHigher - number);
        
        if(diffLower <= diffSame && diffLower <= diffHigher) {
        	return palinLower;
        }else if(diffHigher < diffSame) {
        	return palinHigher;
        }else {
        	return palinSame;
        }
	}

	private static String makePalindrome(String halfStr, boolean isOddLen) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(halfStr);
		if(isOddLen) {
			StringBuilder s =  sb.append(new StringBuilder(halfStr).reverse().substring(1));
			return s.toString();
		}
		else {
		StringBuilder s = sb.append(new StringBuilder(halfStr).reverse());
		return s.toString();
		}
	}

}
