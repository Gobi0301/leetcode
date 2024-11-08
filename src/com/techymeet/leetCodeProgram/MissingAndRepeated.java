package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MissingAndRepeated {

	public static void main(String[] args) {
		Scanner  sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.toString(findmissingAndRepeat(arr)));
	}

	private static int[] findmissingAndRepeat(int[][] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map.put(arr[i][j], map.getOrDefault(arr[i][j], 0)+1);
			}
		}
		int a=-1,b=-1;
		for(int i=1;i<=n*n;i++) {
			if(map.get(i) == 2) {
				a = i;
			}
			else if(map.get(i) == 0) {
				b=i;
			}
		}
		return new int[] {a,b};
	}
}
