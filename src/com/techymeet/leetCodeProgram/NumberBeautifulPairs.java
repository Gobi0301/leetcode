package com.techymeet.leetCodeProgram;

public class NumberBeautifulPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {2,5,1,4};
        System.out.println(countBeautifulPairs(nums));
	}

	private static int countBeautifulPairs(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<nums.length;i++) {
			int firstDigit = getFirstDigit(nums[i]);
			for(int j=i+1;j<nums.length;j++) {
				int lastDigit = getLastDigit(nums[j]);
				if(gcd(firstDigit,lastDigit) == 1) {
					count++;
				}
			}
		}
		return count;
	}

	private static int getFirstDigit(int i) {
		// TODO Auto-generated method stub
		int num = Math.abs(i);
		String numStr = Integer.toString(num);
		char firstChar = numStr.charAt(0);
		return Character.getNumericValue(firstChar);
	}

	private static int getLastDigit(int j) {
		// TODO Auto-generated method stub
		int num = Math.abs(j);
		int last = num % 10;
		return last;
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		while(b != 0) {
			int temp = b;
			b =  a % b;
			a = temp;
		}
		return a;
	}

}
