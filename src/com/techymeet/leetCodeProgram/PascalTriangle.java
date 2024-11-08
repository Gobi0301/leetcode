package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int numRows = 	5;
         List<List<Integer>> list = generate(numRows);
         System.out.println(list);
	}

	private static List<List<Integer>> generate(int numRows) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<>();
		if(numRows == 0) {
			return res;
		}
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		res.add(firstRow);
		
		for(int i=1;i<numRows;i++) {
			List<Integer> prev = res.get(i-1);
			List<Integer> currentRow = new ArrayList<>();
			currentRow.add(1);
			
			
			for(int j=1;j<i;j++) {
				currentRow.add(prev.get(j-1)+prev.get(j));
			}
			currentRow.add(1);
			res.add(currentRow);
		}
		
		return res;
	}

}
