package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = findNextGreaterElement(arr);
		System.out.println(Arrays.toString(res));

	}
	public static int[] findNextGreaterElement(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			if(!st.isEmpty()) {
				while(!st.isEmpty() && st.peek() <= arr[i]) {
					st.pop();
				}
			}
			if(st.isEmpty()) {
				res[i] = -1;
 			}
			else {
				res[i] = st.peek();
			}
			st.push(arr[i]);
		}
		
		return res;
		
	}

}
