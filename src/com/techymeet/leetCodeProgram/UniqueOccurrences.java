package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(uniqueOccurence(arr));

	}

	private static boolean uniqueOccurence(int[] arr) {
		// TODO Auto-generated method stub
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i:arr) {
    	   map.put(i, map.getOrDefault(i,0)+1);
       }
       HashSet<Integer> set = new HashSet<>(map.values());
       return map.size() == set.size();
     
	}

}
