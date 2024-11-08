package com.techymeet.leetCodeProgram;

public class CountTestDeviceOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] battery = {1,1,2,1,3};
        System.out.println(countTestDevices(battery));
	}

	private static int countTestDevices(int[] battery) {
		// TODO Auto-generated method stub
		int d = 0;
		int ans = 0;
		for(int i:battery) {
			if(i > d) {
				d++;
				ans++;	
			}
		}
		return ans;
	}

}
