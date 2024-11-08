package com.techymeet.leetCodeProgram;

public class MinimiumTimeVisitingAllPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeTovisitPoint(points));
	}

	private static int minTimeTovisitPoint(int[][] points) {
		// TODO Auto-generated method stub
		int totalTime = 0;
		int n = points.length;

        for(int i=0;i<n-1;i++){
            totalTime+=Math.max(Math.abs(points[i][0] - points[i+1][0]),Math.abs(points[i][1] - points[i+1][1]));
        }
		return totalTime;
	}

}
