package com.techymeet.leetCodeProgram;

public class CategorizeBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int length = 10000,width=1,height=1,mass=1;
       System.out.println(categorizeBox(length,width,height,mass));
	}

	private static String categorizeBox(int length, int width, int height, int mass) {
		// TODO Auto-generated method stub
		if(length >= 10000 || width >= 10000 || height >= 10000) {
			return  "Bulky";
		}
		long volume = (long) length * width * height ;
		if(volume <= Math.pow(10, 9) && mass >= 100) {
			return "Heavy";
		}else if(volume >= Math.pow(10, 9) && mass < 100){
			return "Bulky";
		}
		else if(volume >= Math.pow(10, 9) && mass > 100) {
			return "Both";
		}
		else {
			return "Neither";
		}
		
	}

}
