package com.techymeet.leetCodeProgram;

public class MaximumSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = 2736;
       int ans = maximumSwap(num);
       System.out.println(ans);
	}

	private static int maximumSwap(int num) {
		// TODO Auto-generated method stub
		char[] numArr = Integer.toString(num).toCharArray();
		int n = numArr.length;
		int[] last = new int[10];
		for(int i=0;i<n;i++) {
			last[numArr[i] - '0'] = i;
		}
		
		for(int i=0;i<n;i++) {
			for(int d=9;d>numArr[i] - '0';d--) {
				if(last[d] > i) {
					char temp = numArr[i];
					numArr[i] = numArr[last[d]];
					numArr[last[d]] = temp;
					return Integer.parseInt(new String(numArr));
				}
			}
		}
		
		return num;
	}

}
