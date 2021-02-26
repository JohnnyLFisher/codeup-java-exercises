package grades;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList grades = new ArrayList();

	Student() {}

	Student(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public ArrayList getGrades() {
		return this.grades;
	}

	public int getGrades(int grade) {
		return (int)this.grades.get(grade);
	}

	public int getGradesSize() {
		return this.grades.size();
	}

	public void addGrade(int grade) {
		this.grades.add(grade);
	}

	public double getGradeAverage() {
		double gradeTotal = 0;
		for (int i = 0; i < grades.size(); i++) {
			gradeTotal += ((double) (int) this.grades.get(i));
		}
		return gradeTotal / this.grades.size();
	}

}