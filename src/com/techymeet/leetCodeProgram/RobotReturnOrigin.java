package com.techymeet.leetCodeProgram;

public class RobotReturnOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String moves = "UD";
       System.out.println(judgeCircle(moves));
	}

	private static boolean judgeCircle(String moves) {
		// TODO Auto-generated method stub
		int upDown =0;
		int rightLeft = 0;
		for(char c:moves.toCharArray()) {
			if(c == 'U') {
				upDown++;
			}
			else if(c == 'D') {
				upDown--;
			}
			else if(c == 'R') {
				rightLeft++;
			}
			else if(c == 'L') {
				rightLeft--;
			}
		}
		
		return (rightLeft == 0 && upDown == 0);
	}

}
