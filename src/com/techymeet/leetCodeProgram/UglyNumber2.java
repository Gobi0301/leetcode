package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.PriorityQueue;

public class UglyNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 10;
       int ans = nthUglyNumber(n);
       System.out.println(ans);
	}

	private static int nthUglyNumber(int n) {
		// TODO Auto-generated method stub
/*		int[] primes = {2,3,5};
		PriorityQueue<Long> uglyHeap = new PriorityQueue<>();
		HashSet<Long> visited = new HashSet<>();
		uglyHeap.add(1L);
		visited.add(1L);
		
		long curr = 1L;
		for(int i=0;i<n;i++) {
			curr = uglyHeap.poll();
			for(int prime :primes) {
				long new_ugly = curr * prime;
				if(!visited.contains(new_ugly)) {
					uglyHeap.add(new_ugly);
					visited.add(new_ugly);
				}
			}
		}
		return (int) curr;
		
*/	
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		
		int i2,i3,i5;
		i2=i3=i5=1;
		
		for(int i=2;i<=n;i++) {
			int n2 = dp[i2] * 2;
			int n3 = dp[i3] * 3;
			int n5 = dp[i5] * 5;
			
			int toInsert = Math.min(n2, Math.min(n3, n5));
			dp[i] = toInsert;
			
			if(toInsert == n2) {
				i2++;
			} if(toInsert == n3) {
				i3++;
			}if(toInsert == n5) {
				i5++;
			}
		}
		return dp[n];
		}

}
