package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc  = new Scanner(System.in);
     int nums[] = {1,2,3,4};
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i:nums) {
    	 if(map.containsKey(i)) {
    	 map.put(i, map.getOrDefault(i, 0)+1);
    	 }
    	 else {
    		 map.put(i,1);
    	 }
     }
     
     for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
    	 if(entry.getValue()>=2) {
    		System.out.println("true");
    	 }
    	 else {
    		 System.out.println("false");
    	 }
     }
}
	

}
