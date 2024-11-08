package com.techymeet.leetCodeProgram;

public class KthSmallestLexicographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 13;
		int k = 2;
		int ans = findKthNumber(n,k);
		System.out.println(ans);
	}

	private static int findKthNumber(int n, int k) {
		// TODO Auto-generated method stub
		k = k-1;
		int curr = 1;
		while(k>0) {
			int iteration = getCount(n,curr,curr+1);
			if(iteration <=k) {
				curr++;
				k = k- iteration;
			}else {
				curr *=10;
				k = k-1;
			}
		}
		return curr;
	}

	private static int getCount(int n, long tree1, long tree2) {
		// TODO Auto-generated method stub
		int iteration = 0;
		while(tree1<=n) {
			iteration += Math.min(n+1, tree2)-tree1;
			tree1 *=10;
			tree2 *=10;
		}
		return iteration;
	}

}
