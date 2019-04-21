package edu.uic.ids.console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Assignment6{
	private String shapeType;
	private double length;
	private double width;
	private double radius;
	private final double Pi = Math.PI;
	private double area;
	private double perimeter;
	public Assignment6() {
		shapeType = "";
		length = 0.0;
		width = 0.0;
		radius = 0.0;
		area = 0.0;
		perimeter = 0.0;
	}
	public void computeShape() {
		// use switch-case statement for shape type
		switch(shapeType.toUpperCase()) {
		case "s":
		case "S": 
			area = length * length;
			perimeter = 4 * length;
			width = 0.0;
			radius = 0.0;
			break;
		case "r":
		case "R": 
			area = length * width;
			perimeter = 2 * (length + width);
			radius = 0.0;
			break;
		case "c":
		case "C": 
			area = Pi * radius * radius;
			perimeter = 2.0 * Pi * radius;
			length = 0.0;
			width = 0.0;
			break;
		default:
			area = 0.0;
			perimeter = 0.0;
			break;
		}
}
	public String getShapeType() {
		return shapeType;
	}
	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
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
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
}
