package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class MostFrequentEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          int  n = sc.nextInt();
          int[] arr = new int[n];
          for(int i=0;i<arr.length;i++) {
        	  arr[i] = sc.nextInt();
          }
          
         System.out.println(frequentEven(arr));
	}

	private static int frequentEven(int[] arr) {
		// TODO Auto-generated method stub
		/*int max = 0;

		for(int i=0;i<arr.length;i++) {
			max = Math.max(max, arr[i]);
		}
		int[] ans = new int[max+1];
		for(int i=0;i<arr.length;i++) {
			ans[arr[i]]++;
		}
		int min = Integer.MAX_VALUE;
		for(int i=1;i<ans.length;i++) {
			if(i%2 == 0 && ans[i]>1) {
				if()
				min = Math.min(i, min);
			}
			
		}
		if(min == Integer.MAX_VALUE) {
			return -1;
		}
		return min;*/
		int temp[] = new int[100001];
        for(int i : arr) temp[i]++;
        int  freq = 0 , ans = -1;
        for(int i=0; i<temp.length; i++){
            if(i%2==0 && freq<temp[i]){
                freq = temp[i];
                ans = i;
            }
        }
        return ans;
	}

}
