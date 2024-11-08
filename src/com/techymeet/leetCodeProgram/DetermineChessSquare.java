package com.techymeet.leetCodeProgram;

public class DetermineChessSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String coordinates = "c7";
        System.out.println(squareIsWhite(coordinates));
	}

	private static boolean squareIsWhite(String coordinates) {
		// TODO Auto-generated method stub
		char c1 = coordinates.charAt(0);
		char c2 = coordinates.charAt(1);
		int a = c1 + c2;
		if(a % 2 == 0) {
			return false;
		}
		return true;
	}

}
