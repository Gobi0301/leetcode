package com.techymeet.leetCodeProgram;

public class SplitTwoStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abda";
		String b = "acmc";
		System.out.println(checkPalindorme(a,b));

	}

	private static boolean checkPalindorme(String a, String b) {
		// TODO Auto-generated method stub
		return validate(a,b) || validate(b,a);
	}

	private static boolean validate(String a, String b) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = a.length()-1;
		while(left < right) {
			if(a.charAt(left) != b.charAt(right)) {
				break;
			}
			left++;
			right--;
		}
		return getValidate(a,left,right) || getValidate(b,left,right);
	}

	private static boolean getValidate(String a, int left, int right) {
		// TODO Auto-generated method stub
		while(left<right) {
			if(a.charAt(left) != a.charAt(right)) {
				break;
			}
			left++;
			right--;
		}
		return left>=right;
	}

}
