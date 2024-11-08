package com.techymeet.leetCodeProgram;


import java.util.ArrayList;
import java.util.List;

public class LexicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 13;
		List<Integer> list = lexicalOrder(n);
		System.out.println(list);
	}

	private static List<Integer> lexicalOrder(int n) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		int curr = 1;
		for(int i=1;i<=n;i++) {
			list.add(curr);
			if(curr * 10 <=n) {
				curr = curr * 10;
			}else {
				while(curr % 10 == 9 || curr>=n) {
					curr /=10;
				}
				curr+=1;
			}
		}
		return list;
	}

}
