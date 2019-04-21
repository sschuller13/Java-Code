package edu.uic.ids.console;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShapeCopy {
char shape;
double length, width, area, perimeter, radius;
int count;
final double pi = 3.14159265359;
public ShapeCopy(){
	length = 0;
	width = 0;
	area = 0;
	perimeter = 0;
	radius = 0;
	shape = ' ';
}
public ShapeCopy computeShape(){
	switch(this.getShape()) {
	case 'R':
    case 'r':
    	area = length*width;
    	perimeter = 2*length*width; 
          break;
	case 's':
	case 'S':
		area=length*length;  
   		perimeter=4*length; 
   		break;
	case 'c':
    case 'C':
          area = pi *radius*radius;
          perimeter = 2*pi*radius; 
          break;

    default:

          System.out.println("Bad Shape");
	}	
	return null;
}
public String parseCsvTabSpace() {
	File outputFile = new File("shapeFile");
	
	String status = "SUCCESS";
	
	
	Scanner sc = null; 
	Scanner sc2 = null;
	PrintWriter printWriter = null;
	String dataLine = null;
	count = 0;
	String value = null; 
	try {
		sc = new Scanner("shapeFile");
		printWriter = new PrintWriter(outputFile);
		while(sc.hasNextLine()) {
			dataLine =sc.nextLine();
			sc2 = new Scanner(dataLine);
			//sc2.useDelimter("\t"); //tab delimited
			sc2.useDelimiter(",");
			while(sc2.hasNext()) {
				value =sc2.next();
				printWriter.print(value + "		");
			//      SC2->
			// SC #, #, #, #, #
			//  | #, #, #, #, #
			//  v #, #, #, #, #
			}
			printWriter.println();
			count++;
		}
	}
	catch(FileNotFoundException e) {
		status = "FALSE: File not Found";
	}
	catch(IOException e) {
		status = "FALSE: Input/Output Exception";
	}
	finally {
		sc.close();
		sc2.close();
		//printWriter.flush();
		printWriter.close();
	}		
	return status;
}
public char getShape() {
	return shape;
}
public void setShape(char shape) {
	this.shape = shape;
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
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public double getPerimeter() {
	return perimeter;
}
public void setPerimeter(double perimeter) {
	this.perimeter = perimeter;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}

}

