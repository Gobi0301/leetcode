package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Set;

public class WalkingRobotSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] commands = {4,-1,4,-2,4};
		int[][] obstacles = {{2,4}};
		int ans = robotSim(commands,obstacles);
		System.out.println(ans);
		}

	private static int robotSim(int[] commands, int[][] obstacles) {
		// TODO Auto-generated method stub
		int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
		Set<String> obstacleSet = new HashSet<>();
		for(int[] obstacle:obstacles) {
			obstacleSet.add(obstacle[0] + ","+obstacle[1]);
		}
		int x =0,y=0,dir=0;
		int maxDistanceSquared = 0;
		for(int command:commands) {
			if(command == -2) {
				dir = (dir + 3)%4;
			}else if(command == -1) {
				dir = (dir +1)%4;
			}else {
				for(int i=0;i<command;i++) {
					int nextX = x + directions[dir][0];
					int nextY = y + directions[dir][1];
					if(!obstacleSet.contains(nextX + ","+nextY)) {
						x = nextX;
						y = nextY;
						maxDistanceSquared = Math.max(maxDistanceSquared, x *x+y*y);
					}else {
						break;
					}
				}
			}
		}
		
		return maxDistanceSquared;
	}

}
