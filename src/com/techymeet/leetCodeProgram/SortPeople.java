package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SortPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int height[] = {17233,32521,14087,42738,46669,65662,43204,8224};
		String[] names = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
		System.out.println(Arrays.toString(findSortPeople(height,names)));

	}

	private static String[] findSortPeople(int[] height, String[] names) {
		// TODO Auto-generated method stub
			for(int i=0;i<height.length;i++) {
				for(int j=i+1;j<height.length;j++) {
					if(height[i] < height[j]) {
						int temp1 = height[i];
						height[i] = height[j];
						height[j] =  temp1;
						String temp = names[i];
						names[i] = names[j];
						names[j] = temp;
					}
				}
			}
			return names;
	}

}
