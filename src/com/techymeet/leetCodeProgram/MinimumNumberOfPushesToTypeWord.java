package com.techymeet.leetCodeProgram;

public class MinimumNumberOfPushesToTypeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String word = "xycdefghij";
       System.out.println(minimumPushes(word));
	}

	private static int minimumPushes(String word) {
		// TODO Auto-generated method stub
	/*	int count =1,index =1,sum=0;
		for(char c:word.toCharArray()) {
			if(index > 8) {
				index = 2;
				count++;
			}
			else {
				index++;
			}
			sum = sum + (count * 1);
		}
		return sum;*/
		int i = 1;
		int n = word.length();
		int r = 0;
		while(n != 0) {
			r+=Math.min(n, 8)*i;
			n-=Math.min(n, 8);
			i++;
		}
		return r;
	}

}
