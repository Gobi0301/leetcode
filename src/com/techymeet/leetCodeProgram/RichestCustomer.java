package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class RichestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc  = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] arr = new int[n][];
            for(int i=0;i<n;i++) {
            	for(int j=0;j<n;j++) {
            		arr[i][j] = sc.nextInt();
            	}
            }
	}

}
