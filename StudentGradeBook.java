package edu.uic.ids.model;

public class StudentGradeBook {
	int UIN;
	double exam01;
	double exam02;
	double exam03;
	
	double total;
	String grade; 


public StudentGradeBook() {
	UIN = 0;
	exam01 = 0.0;
	exam02 = 0.0;
	exam03 = 0.0;
	total = 0.0;
	grade = "x";
	
}
public String computeGrade() {
	total = exam01+exam02+exam03;
	return grade;
}
public int getUIN() {
	return UIN;
}
public void setUIN(int UIN) {
	this.UIN = UIN;
}
public StudentGradeBook(int UIN, double exam01, double exam02, double exam03) {
	this();
	this.UIN = UIN;
	this.exam01 = exam01;
	this.exam02 = exam02;
	this.exam03 = exam03;
}
public double getExam01() {
	return exam01;
}
public void setExam01(double exam01) {
	this.exam01 = exam01;
}
public double getExam02() {
	return exam02;
}
public void setExam02(double exam02) {
	this.exam02 = exam02;
}
public double getExam03() {
	return exam03;
}
public void setExam03(double exam03) {
	this.exam03 = exam03;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public String getGrade() {
	return grade;
}
}