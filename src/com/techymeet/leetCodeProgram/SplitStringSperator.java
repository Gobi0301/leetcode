package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class SplitStringSperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] words = {"one.two.three","four.five","six"};
        char seperator = '.';
        System.out.println(splitByWordSeperator(words,seperator));
	}

	private static List<String> splitByWordSeperator(String[] words, char seperator) {
		// TODO Auto-generated method stub
		String add ="";
		List<String> list = new ArrayList<>();
		/*for(int i=0;i<words.length;i++) {
			String s = words[i];
			char[] c = s.toCharArray();
			for(int j=0;j<c.length;j++) {
				if( c[j] != seperator) {
					 add+=c[j];
				}else {
					add+=" ";
				}
			}
			list.add(add);
			add ="";
		}
		list.spliterator();*/
	  for(String str : words) {
		  String[] arr = str.split("\\Q" +seperator+"\\E");
		  for(String s :arr) {
			  if(!s.isEmpty()) {
				  list.add(s);
			  }
		  }
	  }
		return list;
	}

}
