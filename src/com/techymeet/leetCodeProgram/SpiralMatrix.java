package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> ans = spiralOrder(matrix);
		System.out.println(ans);
	}

	private static List<Integer> spiralOrder(int[][] matrix) {
		// TODO Auto-generated method stub
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int row = 0;
		int col = -1;
		
		int direction = 1;
		
		List<Integer> list = new ArrayList<>();
		
		while(rows > 0 && cols > 0) {
			
			for(int i=0;i<cols;i++) {
				col+=direction;
				list.add(matrix[row][col]);
			}
			rows--;
			
			for(int i=0;i<rows;i++) {
				row+=direction;
				list.add(matrix[row][col]);
			}
			cols--;
			
			direction *=-1;
		}
		
		return list;
	}

}
