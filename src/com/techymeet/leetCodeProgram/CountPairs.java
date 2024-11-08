package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int target = sc.nextInt();
      int n = sc.nextInt();
   List<Integer> list = new ArrayList<Integer>();
   for(int i=0;i<n;i++) {
	   list.add(sc.nextInt());
   }
  int count = countPairs(list, target);
  System.out.println(count);
	}

	private static int countPairs(List<Integer> list, int target) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1; j<list.size();j++) {
				if(list.get(i) + list.get(j) < target)
					count++;
			}
		}
		return count;
	}

}
