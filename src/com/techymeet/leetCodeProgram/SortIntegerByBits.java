package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Comparator;

public class SortIntegerByBits {
	
	
	static class Bits{
		int num;
		int bits;
		Bits(int num,int bits){
			this.num = num;
			this.bits = bits;
		}
	}
	
	static class BitComparator implements Comparator<Bits>{

		@Override
		public int compare(Bits a, Bits b) {
			// TODO Auto-generated method stub
			if(a.bits - b.bits == 0) {
			   return a.num-b.num;
			}
			return a.bits-b.bits;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
	}

	private static int[] sortByBits(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		Bits ans[] = new Bits[n];
		
		for(int i=0;i<n;i++) {
			ans[i] = new Bits(arr[i],helper(arr[i]));
		}
		Arrays.sort(ans,new BitComparator());
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = ans[i].num;
		}
		return a;
	}

	private static int helper(int i) {
		// TODO Auto-generated method stub
		int ans = 0;
		while(i>0) {
			if(i%2 != 0) {
				ans++;
			}
			i/=2;
		}
		return ans;
	}

}
