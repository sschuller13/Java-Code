import java.util.Random;
public class StudentDatabase {
	Student[] students;
	Random r;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDatabase sd = new StudentDatabase(40);
	}
	StudentDatabase(int size){
		students = new Student[size];
		r = new Random();
		
		//randomly create array elements as undergrad or grad students
		for(int index=0; index <size;index++) {
			if(r.nextBoolean()) students[index] = new undergradStudent();
			else students[index] = new gradStudent();
		}
		//generate synthetic exam scores for demo purposes
		for(int index=0;index<size;index++) 
		{
			//r.nextInt(x) returns a random int between 0-40, 0-35,0-30
			students[index].exam1= 40 + r.nextInt(41);
			students[index].exam2= 60 + r.nextInt(36);
			students[index].exam3= 55 + r.nextInt(31);
		}
		//compute grades
		for(int index=0;index<size;index++) {
			students[index].computeGrade();
		}
		//display status and grades
		for(int index=0;index<size;index++) {
			String s = "";
			if(students[index] instanceof gradStudent) s+= "G\t";
			else s+= "U\t";
			
			s+= students[index].exam1 + "\t";
			s+= students[index].exam2 + "\t";
			s+= students[index].exam3 + "\t";
			s+= students[index].letterGrade;
			System.out.println(s);
		}
	}
}
//if you make this class abstract you can never make a new student object, bc it is abstract
class Student{
	String name;
	int exam1,exam2,exam3;
	String letterGrade;
	
	void computeGrade()
	{
		
	}
	String findGrade(int value, int number) {
		value = value / number;
		if(value>65) return "P";
		else return "F.";
	}
}
//as policy, undergrad grade is the average of two best exam scores
class undergradStudent extends Student{
	void computeGrade() {
		if(exam1<exam2 && exam2<exam3) letterGrade = findGrade(exam2+exam3,2);
		else if(exam2<exam1 && exam2<exam3) letterGrade = findGrade(exam1+exam3,2);
		else letterGrade = findGrade(exam1+exam2, 2);
	}
}
//as policy, grad grade is the average of all three test scores
class gradStudent extends Student{
	void computeGrade()
	{
		letterGrade = findGrade(exam1+exam2+exam3,3);
	}
	
}
class NCStudent extends Student{
	void computeGrade() {
		letterGrade = "NG";
	}
}
