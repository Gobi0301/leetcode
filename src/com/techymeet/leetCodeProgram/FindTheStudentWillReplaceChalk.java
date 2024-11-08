package com.techymeet.leetCodeProgram;

public class FindTheStudentWillReplaceChalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] chalk = {3,4,1,2};
		int k = 25;
		int ans = chalkReplacer(chalk,k);
		System.out.println(ans);
	}

	private static int chalkReplacer(int[] chalk, int k) {
		// TODO Auto-generated method stub
	   long totalNumber = 0;
	   for(int i:chalk) {
		   totalNumber += i;
	   }
	   int remain = (int) ( k % totalNumber);
	   for(int i=0;i<chalk.length;i++) {
		   if(remain < chalk[i]) {
			   return i;
		   }
		   remain = -chalk[i];
	   }
	   return 0;
	}

}
