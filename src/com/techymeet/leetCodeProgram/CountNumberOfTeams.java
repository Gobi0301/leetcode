package com.techymeet.leetCodeProgram;

public class CountNumberOfTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] rating = {1,2,3,4};
        int res = numTeams(rating);
        System.out.println(res);
	}

	private static int numTeams(int[] rating) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<rating.length;i++) {
			for(int j=i+1;j<rating.length;j++) {
				for(int k=j+1;k<rating.length;k++) {
					if((rating[i] > rating[j] && rating[j] > rating[k]) || (rating[i] < rating[j] && rating[j] < rating[k])) {
						count++;
					}
				}
			}
		}
		return count;
	} 

}
