package com.techymeet.leetCodeProgram;

public class MinimumAmountofTimeCollectGarbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] garbage = {"G","P","GP","GG"};
        int[] travel  = {2,4,3};
        System.out.println(garbageCollection(garbage,travel));
	}

	private static int garbageCollection(String[] garbage, int[] travel) {
		// TODO Auto-generated method stub
		int count = 0;
		
		int gindex = 0;
		for(int i=0;i<garbage.length;i++) {
			if(garbage[i].contains("G")) {
				int occur = func(garbage[i],'G');
				count+=occur;
				gindex = i;
			}
		}
		
		if(gindex > 0) {
			int travels = funcc(travel,gindex);
			count+=travels;
		}
		
		int Pindex = 0;
		for(int i=0;i<garbage.length;i++) {
			if(garbage[i].contains("P")) {
				int occur = func(garbage[i],'P');
				count+=occur;
				Pindex = i;
			}
		}
		
		if(Pindex > 0) {
			int travels = funcc(travel,Pindex);
			count+=travels;
		}
		
		int Mindex = 0;
		for(int i=0;i<garbage.length;i++) {
			if(garbage[i].contains("M")) {
				int occur = func(garbage[i],'M');
				count+=occur;
				Mindex = i;
			}
		}
		
		if(Mindex > 0) {
			int travels = funcc(travel,Mindex);
			count+=travels;
		}	
		
		return count;
	}

	private static int func(String s, char c) {
		// TODO Auto-generated method stub
		int temp = 0;
		char[] ch = s.toCharArray();
		for(char c1 :ch) {
			if(c1 == c) {
				temp++;
			}
		}
		
		return temp;
	}

	private static int funcc(int[] travel, int gindex) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i=0;i<gindex;i++) {
			temp += travel[i];
		}
		
		return temp;
	}

}
