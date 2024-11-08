package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] num1 = new int[n];
	    for(int i=0;i<num1.length;i++) {
	    	num1[i] = sc.nextInt();
	    }
	    int m = sc.nextInt();
	    int[] num2 = new int[m];
	    for(int i=0;i<num2.length;i++) {
	    	num2[i] = sc.nextInt();
	    }
	    int[] res = nextGreater(num1,num2);
	    System.out.println(Arrays.toString(res));

	}

	private static int[] nextGreater(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> queryReverseMapping = new HashMap<>();
        for(int i=0;i<num1.length;i++) {
            queryReverseMapping.put(num1[i], i);
        } 
        Stack<Integer> stack = new Stack<>();
        for(int i = num2.length - 1;i>=0;i--) {
            int result = -1;
            while(!stack.isEmpty() && stack.peek() <= num2[i]) {
                stack.pop();
            }
            if(!stack.isEmpty()) {
                result = stack.peek();
            }
            stack.push(num2[i]);
            if(queryReverseMapping.containsKey(num2[i])) {
                num1[queryReverseMapping.get(num2[i])] = result;
            }
        }
        return num1;
	}
 
}
