package com.techymeet.leetCodeProgram;

public class PassThePillow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 3;
       int times = 2;
       System.out.println(passthePillow(n,times));
	}

	private static int passthePillow(int n, int times) {
		// TODO Auto-generated method stub
		 /* int ans = n;
	       int current = 1;
	       int time = times;
	       while(time > 0){
	        current++;
	        if(current >= ans){
	            ans--;
	        }
	        time--;
	       }
	       if(n > times){
	        return current;
	       }
	       return ans;*/
		int ans = 0;
		int m = times/(n-1);
		int r = times%(n-1);
		
		if(m % 2 == 0) {
			ans = r +1;
		}else {
			ans = n - r;
		}
		return ans;
	}

}
