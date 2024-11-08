package com.techymeet.leetCodeProgram;

public class CountDayTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
        String arriveAlice = "08-15";
        String leaveAlice = "08-18";
        String arriveBob = "08-16";
        String leaveBob = "08-19";
        
        System.out.println(countDayTogether(arriveAlice,leaveAlice,arriveBob,leaveBob));
	}

	private static int countDayTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
		// TODO Auto-generated method stub
		  int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	        String 	ar,dp;
	        
	        ar = arriveAlice.compareTo(arriveBob) <= 0 ? arriveBob : arriveAlice;
	        
	        dp = leaveAlice.compareTo(leaveBob) <= 0 ? leaveAlice : leaveBob;
	        
	        int ret = 1;
	        
	        if(ar.compareTo(dp) > 0) {
	        	return 0;
	        }
	        
	        int amm = Integer.parseInt(ar.substring(0,2));
	        int dmm = Integer.parseInt(dp.substring(0,2));
	        int add = Integer.parseInt(ar.substring(3));
	        int ddd = Integer.parseInt(dp.substring(3));
	        
	        
	        for(int i=amm+1;i<dmm;i++) {
	        	ret+=days[i];
	        }
	        
	        if(amm == dmm) {
	        	ret += (ddd-add);
	        }
	        
	        else {
	        	ret+= days[amm] - add;
	        	ret+= ddd;
	        }
	        
		return ret;
	}

}
