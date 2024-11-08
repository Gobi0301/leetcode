package com.techymeet.leetCodeProgram;

public class CountSubIsalnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] gird1 = {{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}};
		int[][] gird2 = {{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}};
		int ans = countSubIsland(gird1,gird2);
		System.out.println(ans);
		
	}
	static boolean subIsland;

	private static int countSubIsland(int[][] gird1, int[][] gird2) {
		// TODO Auto-generated method stub
		boolean[][] visited = new boolean[gird1.length][gird1[0].length];
		int ans = 0;
		for(int i=0;i<gird1.length;i++) {
			for(int j=0;j<gird1[0].length;j++) {
				if(gird2[i][j] == 1 && !visited[i][j]) {
					subIsland = true;
					dfs(gird1,gird2,i,j,visited);
					if(subIsland) ans++;
				}
			}
		}
		return ans	;
	}

	private static void dfs(int[][] gird1, int[][] gird2, int x, int y,boolean[][] visited) {
		// TODO Auto-generated method stub
		if(gird1[x][y] == 0) subIsland = false;
		visited[x][y] = true;
		
		int[] xAxis = {-1,0,0,1};
		int[] yAxis = {0,-1,1,0};
		
		for(int i=0;i<xAxis.length;i++) {
			int newX = x + xAxis[i];
			int newY = y + yAxis[i];
			
			
			if(newX < 0 || newY < 0 || newX>=gird2.length || newY>=gird2[0].length || gird2[newX][newY] == 0)
				continue;
			
			if(gird2[newX][newY] == 1 && !visited[newX][newY]) {
				dfs(gird1,gird2,newX,newY,visited);
			}
		}
		
	}

}
