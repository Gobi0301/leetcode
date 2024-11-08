package com.techymeet.leetCodeProgram;

public class CellsWithOddValuesMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int m  = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};
        int ans = OddCells(m,n,indices);
        System.out.println(ans);
	}

	private static int OddCells(int m, int n, int[][] indices) {
		// TODO Auto-generated method stub
		int[][] ans = new int[m][n];
		for(int i=0;i<indices.length;i++) {
			incRow(ans,indices[i][0]);
		}
		for(int i=0;i<indices.length;i++) {
			incCol(ans,indices[i][1]);
		}
		int oddCell = cal(ans);
		return oddCell;
	}

	private static int cal(int[][] ans) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[i].length;j++) {
				if(ans[i][j] % 2 != 0) {
					count++;
				}
			}
		}
		return count;
	}

	private static void incCol(int[][] ans, int col) {
		// TODO Auto-generated method stub
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[i].length;j++) {
				if(j == col) {
					ans[i][j]++;
				}
			}
		}
	}

	private static void incRow(int[][] ans, int row) {
		// TODO Auto-generated method stub
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[i].length;j++) {
				if(i==row) {
					ans[i][j]++;	
				}
			}
		}
	}

}
