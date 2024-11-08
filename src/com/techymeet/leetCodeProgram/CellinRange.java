package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CellinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  String s  =sc.next();
  List<String> ans = cellRange(s);
  System.out.println(ans);
	}

	private static List<String> cellRange(String s) {
		// TODO Auto-generated method stub
		List<String> ans = new ArrayList<String>();
		char startRow = s.charAt(0);
		char startCol = s.charAt(1);
		char  endRow = s.charAt(3);
		char endCol  = s.charAt(4);
		
		while(startRow <= endRow) {
			while(startCol <= endCol) {
				ans.add(startRow + " "+ startCol);
				startCol++;
			}
			startCol = s.charAt(1);
			startRow++;
		}
		return ans;
	}

}
