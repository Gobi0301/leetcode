package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));

	}

	private static int[] productExceptSelf(int[] nums) {
		// TODO Auto-generated method stub
		int[] products = new int[nums.length];
		int prefixProduct = 1;
		for(int i=0;i<nums.length;i++) {
			products[i] = prefixProduct;
			prefixProduct *= nums[i];
		}
		int suffixProduct = 1;
		for(int i=nums.length-1;i>=0;i--) {
			products[i] *= suffixProduct;
			suffixProduct *= nums[i];
		}
		return products;
	}

}
