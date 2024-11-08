package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaximumNumberPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = maxiNumberPair(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] maxiNumberPair(int[] arr) {
		// TODO Auto-generated method stub
		int pairCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == -1) {
                continue;
            }
            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]) {
                    pairCount++;
                    arr[i] = -1;
                    arr[j] = -1;
                    break;
                }
            }
        }
        int leftOverCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != -1) {
                leftOverCount++;
            }
        }
        return new int[]{pairCount, leftOverCount};
		
		
	}

}
