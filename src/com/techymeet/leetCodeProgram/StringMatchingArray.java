package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] words = {"mass","as","hero","superhero"};
        List<String> res = stringMatching(words);
        System.out.println(res);
	}

	private static List<String> stringMatching(String[] words) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words.length;j++) {
				if(!words[j].equals(words[i]) && words[i].contains(words[j])) {
					if(!list.contains(words[j])) {
						list.add(words[j]);
					}
				}
			}
		}
		return list;
	}

}
