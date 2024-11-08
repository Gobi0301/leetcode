package com.techymeet.leetCodeProgram;

public class MaximumscoreFromRemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "cdbcbbaaabab";
        int x = 4;
        int y = 5;
        
       System.out.println(maximumGain(s,x,y));
	}

	private static int maximumGain(String s, int x, int y) {
		// TODO Auto-generated method stub
		int res = 0;
		String top,bot;
		int top_score,bot_score;
		
		if(y > x) {
			top="ba";
			top_score = y;
			bot = "ab";
			bot_score = x;
		}else {
			top="ab";
			top_score = x;
			bot = "ba";
			bot_score = y;
		}
		
		StringBuilder stack = new StringBuilder();
		for(char c:s.toCharArray()) {
			if(c == top.charAt(1) && stack.length() > 0 && stack.charAt(stack.length()-1) == top.charAt(0)) {
				res+= top_score;
				stack.setLength(stack.length()-1);
			}else {
				stack.append(c);
			}
		}
		
		StringBuilder stack_new = new StringBuilder();
		for(char c:stack.toString().toCharArray()) {
			if(c == bot.charAt(1) && stack_new.length() > 0 && stack_new.charAt(stack_new.length()-1) == bot.charAt(0)) {
				res+= bot_score;
				stack_new.setLength(stack_new.length()-1);
			}else {
				stack_new.append(c);
			}
		}
		
		
		return res;
	}

}
