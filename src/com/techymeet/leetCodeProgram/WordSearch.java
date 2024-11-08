package com.techymeet.leetCodeProgram;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		System.out.println(exist(board,word));
	}

	private static boolean exist(char[][] board, String word) {
		// TODO Auto-generated method stub
		int rows = board.length;
		int cols = board[0].length;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(solve(board,rows,cols,i,j,word,0))
					return true;
			}
		}
		return false;
	}
	
	static int[] rowDirections = {1,-1,0,0};
	 static int[] colDirections = {0,0,1,-1};

	private static boolean solve(char[][] board, int rows, int cols, int row, int col, String word, int index) {
		// TODO Auto-generated method stub
		if(index == word.length())
			return true;
		if(row <0 || row>= rows || col <0 || col >=cols || board[row][col] != word.charAt(index))
		return false;
		
		char temp = board[row][col];
		board[row][col] = '.';
	
		for(int d=0;d<4;d++) {
			int newRow = row + rowDirections[d];
			int newCol = col + colDirections[d];
			
			if(solve(board,rows,cols,newRow,newCol,word,index+1))
				return true;
		}
		board[row][col] = temp;
		return false;
	}

}
