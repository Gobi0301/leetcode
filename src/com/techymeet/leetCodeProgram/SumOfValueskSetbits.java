package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfValueskSetbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> nums = new ArrayList<>();
       for(int i=0;i<n;i++) {
    	   nums.add(sc.nextInt());
       }
       int k = sc.nextInt();
       System.out.println(sumIndiceswithK(nums,k));
	}

	private static int sumIndiceswithK(List<Integer> nums, int k) {
		// TODO Auto-generated method stub
		int ans = 0;
		for(int i=0;i<nums.size();i++) {
			if(Integer.bitCount(i) == k) {
				ans+=nums.get(i);
			}
		}
		return ans;
	}

}
