package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MinimumCostToConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String source = "abcd";
       String target = "acbe";
       char[] original = {'a','b','c','c','e','d'};
       char[] changed = {'b','c','b','e','b','e'};
       int[] cost = {2,5,5,1,2,20};
       long res = minimumCost(source,target,original,changed,cost);
       System.out.println(res);
	}

	static int char_count = 26;
	static int inf = Integer.MAX_VALUE/2;
	
	private static long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
		// TODO Auto-generated method stub
		int[][] conversionGraph = buildConversionGraph(original,changed,cost);
		optimizeConversionPath(conversionGraph);
		return computeTotalConversionCost(source,target,conversionGraph);
	}

	private static long computeTotalConversionCost(String source, String target, int[][] graph) {
		// TODO Auto-generated method stub
		long totalCost = 0;
		for(int i=0;i<source.length();i++) {
			int sourceChar = source.charAt(i) - 'a';
			int targetChar = target.charAt(i) - 'a';
			if(sourceChar != targetChar) {
				if(graph[sourceChar][targetChar] == inf) {
					return -1L;
				}
				totalCost += graph[sourceChar][targetChar];
			}
		}
		return totalCost;
	}

	private static void optimizeConversionPath(int[][] graph) {
		// TODO Auto-generated method stub
		for(int k=0;k<char_count;k++) {
			for(int i=0;i<char_count;i++) {
				if(graph[i][k] < inf) {
					for(int j=0;j<char_count;j++) {
						if(graph[k][j] < inf) {
							graph[i][j] = Math.min(graph[i][j], graph[i][k]+graph[k][j]);
					   }
					}
				}
			}
		}
		
	}

	private static int[][] buildConversionGraph(char[] original, char[] changed, int[] cost) {
		// TODO Auto-generated method stub
		int[][] graph = new int[char_count][char_count];
		for(int[] row:graph) {
			Arrays.fill(row, inf);
		}
		
		for(int i=0;i<char_count;i++) {
			graph[i][i] = 0;
		}
		
		for(int i=0;i<cost.length;i++) {
			int from = original[i] - 'a';
			int to = changed[i] - 'a';
			graph[from][to] = Math.min(graph[from][to], cost[i]);
		}	
		return graph;
	}

}
