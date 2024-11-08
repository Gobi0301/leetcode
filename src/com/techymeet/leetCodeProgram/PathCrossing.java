package com.techymeet.leetCodeProgram;


import java.util.HashSet;
import java.util.Set;

public class PathCrossing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "NES";
		boolean ans = isPathCrossing(path);
		System.out.println(ans);
	}

	private static boolean isPathCrossing(String path) {
		// TODO Auto-generated method stub
		Set<String> points = new HashSet<>();
		points.add("0,0");
		
		int x = 0, y= 0;
		for(char d:path.toCharArray()) {
			if(d == 'N') y++;
			else if(d == 'S') y--;
			else if(d == 'E') x++;
			else if(d == 'W') x--;
			
			if(points.contains(x+","+y)) {
				return true;
			}
			points.add(x+","+y);
		}
		
		return false;
	}

}
