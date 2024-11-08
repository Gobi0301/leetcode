package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFolderFromFileSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] folder = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
		List<String> ans = removeSubFolder(folder);
		System.out.println(ans);
	}

	private static List<String> removeSubFolder(String[] folder) {
		// TODO Auto-generated method stub
		Arrays.sort(folder);
		List<String> ans = new ArrayList<>();
		ans.add(folder[0]);
		
		for(int i=1;i<folder.length;i++) {
			String last = ans.get(ans.size() -1) +"/";
			
			if(!folder[i].startsWith(last)) {
				ans.add(folder[i]);
			}
		}
		
		return ans;
	}

}
