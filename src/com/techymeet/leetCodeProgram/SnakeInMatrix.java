package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SnakeInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;
		List<String> commands = Arrays.asList("Right","Down");
		int ans = finalPositionOfSnake(n,commands);
		System.out.println(ans);
	}

	private static int finalPositionOfSnake(int n, List<String> commands) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Down", n);
		map.put("Up", -n);
		map.put("Right", 1);
		map.put("Left", -1);
		int ans = 0;
		for(int i=0;i<commands.size();i++) {
			ans = ans + map.get(commands.get(i));
		}
		
		return ans;
	}

}
