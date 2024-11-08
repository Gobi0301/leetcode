package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] mountain = {2,4,4};
       List<Integer> res = findpeaks(mountain);
       System.out.println(res);
	}

	private static List<Integer> findpeaks(int[] mountain) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<mountain.length-1;i++) {
			int prev = mountain[i-1];
			int curr = mountain[i];
			int next = mountain[i+1];
			
			if(prev < curr && curr > next) {
				list.add(i);
			}
		}
		return list;
	} 

}
