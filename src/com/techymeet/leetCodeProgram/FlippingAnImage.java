package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class FlippingAnImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
       System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
	}

	private static int[][] flipAndInvertImage(int[][] image) {
		// TODO Auto-generated method stub
		for(int[] row:image) {
			for(int i=0;i<(image[0].length+1)/2;i++) {
				int temp = row[i] ^ 1;
				row[i] = row[image[0].length-i-1] ^1;
				row[image[0].length-i-1] = temp;
			}
		}
		return image;
	}

}