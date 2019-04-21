package edu.uic.ids.console;
import java.util.Scanner;
import java.text.NumberFormat;
/* Sam Schuller UIN: 657353888
 * 2/4/19 Rectangle Class IDS 401
 */

public class Rectangle {
double length; 
double width;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
public Rectangle() {
	length = 0.0;
	width= 0.0;
	
}
public Rectangle(double length, double width) {
	super();
	this.length = length;
	this.width = width;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public String getArea(double width, double length) {
	double area = length*width;
	NumberFormat number = NumberFormat.getNumberInstance();
    number.setMinimumFractionDigits(3);
    String areaMessage = 
        "Area: " + number.format(area) + "\n" ;
    System.out.println(areaMessage);
	return areaMessage;
}

public String getPerimeter(double width, double length) {
	double perimeter = (2*length)+(2*width);
	NumberFormat number = NumberFormat.getNumberInstance();
    number.setMinimumFractionDigits(3);
    String perimeterMessage = 
        "Perimeter: " + number.format(perimeter) + "\n" ;
    System.out.println(perimeterMessage);
	return perimeterMessage;
}

}
