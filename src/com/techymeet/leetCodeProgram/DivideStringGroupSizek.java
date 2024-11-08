package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideStringGroupSizek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "abcdefghij";
        int k  =3;
        char fill = 'x';
        System.out.println(Arrays.toString(divideString(s,k,fill)));
		}

	private static String[] divideString(String s, int k, char fill) {
		// TODO Auto-generated method stub
	/*    List<String> list = new ArrayList<>();
	    for(int i=0;i<s.length();i+=k) {
	    	StringBuilder sb = new StringBuilder();
	    	if(i+k<=s.length())
	    		sb.append(s.substring(i, i+k));
	    	else
	    		sb.append(s.substring(i));
	    	if(sb.length()!=k) {
	    		for(int j=sb.length();j<k;j++)
	    			sb.append(fill);
	    	}
	    	list.add(sb.toString());
	    }
	    
	    int n = list.size();
	    String[] str = new String[n];
	    for(int i=0;i<str.length;i++) {
	    	str[i] = list.get(i);
	    }*/
		
		 StringBuilder sb=new StringBuilder(s);
	        while(sb.length()%k!=0){
	            sb.append(fill);
	        }
	        int n=sb.length();
	        String[] result=new String[n/k];
	        for(int i=0;i<n/k;i++){
	            result[i]=sb.substring(i*k,(i+1)*k);
	        }
	        return result;
		//return str;
	}

}
