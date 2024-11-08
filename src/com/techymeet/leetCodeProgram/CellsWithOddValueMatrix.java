package com.techymeet.leetCodeProgram;

public class CellsWithOddValueMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] indices = {{0,1},{1,1}};
       int m=2;
       int n=3;
       System.out.println(oddCells(m,n,indices));
	}

	private static int oddCells(int m, int n, int[][] indices) {
		// TODO Auto-generated method stub
		int count = 0;
		int[] row = new int[n];
		int col[] = new int[m];
		for(int x[]: indices) {
			row[x[0]]++;
			col[x[1]]++;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if((row[i]+col[j]) %2 != 0) {
					count++;
				}
			}
		}
		return count;
	}
	
}
