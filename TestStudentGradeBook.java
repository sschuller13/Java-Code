package edu.uic.ids.model;
import edu.uic.ids.model.StudentGradeBook;

public abstract class TestStudentGradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentGradeBook sgb [] = new StudentGradeBook[5];
		StudentGradeBook obj1 = null;
		StudentGradeBook obj = new StudentGradeBook(1234, 100.0, 200.0, 150.0);
		
		
		sgb[0] = obj;
		sgb[1] = new StudentGradeBook(1235, 200.0, 200.0, 120.0);
		sgb[2] = new StudentGradeBook(1236,75.0,80.0,145.0);
		sgb[4] = new StudentGradeBook(1237,56.0,180.0,177.0);
		String g;

		for(int i = 0; i < sgb.length;i++) {
			if(sgb[i] == null) {
				System.out.println("null entry at "+i);
			}
			else {
				obj = sgb[i];
				g = sgb[i].computeGrade();
				System.out.println("Total = "+obj.getTotal()+", Grade: " + obj.getGrade());

			}
		}
	
		
}
}
