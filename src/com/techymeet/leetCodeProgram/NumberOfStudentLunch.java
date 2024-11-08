package com.techymeet.leetCodeProgram;

public class NumberOfStudentLunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] students = {1,1,0,0};
		int[] sandwiches = {0,1,0,1};
		System.out.println(countStudents(students,sandwiches));
	}

	private static int countStudents(int[] students, int[] sandwiches) {
		// TODO Auto-generated method stub
		int studentWith0 = 0;
		int studentWith1;
		for(int num :students) {
			if(num == 0) {
				studentWith0++;
			}
		}
		studentWith1 = students.length - studentWith0;
		for(int sand:sandwiches) {
			if(studentWith0 == 0 && sand == 0) {
				return studentWith1;
			}else if(studentWith1 == 0 && sand == 1) {
				return studentWith0;
			}
			if(sand == 0)
				studentWith0--;
			else
				studentWith1--;
		}
		return 0;
	}

}
