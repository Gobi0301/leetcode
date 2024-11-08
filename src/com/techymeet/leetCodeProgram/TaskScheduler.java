package com.techymeet.leetCodeProgram;

public class TaskScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] tasks = {'A','C','A','B','D','B'};
		int n = 2;
		System.out.println(leastInterval(tasks,n));
	}

	private static int leastInterval(char[] tasks, int n) {
		// TODO Auto-generated method stub
		int[] freq = new int[26];
		int max = 0;
		for(char c:tasks) {
			freq[c-'A']++;
		max = Math.max(max, freq[c-'A']);
		}
		int numOfElementMaxFreq = 0;
		for(int count:freq) {
			if(count == max) {
				numOfElementMaxFreq++;
			}
		}
		int interval = Math.max((n+1)*(max-1)+numOfElementMaxFreq, tasks.length);
		return interval;
	}

}
