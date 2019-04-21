package edu.uic.ids.console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class ShapeCopy6 {
// inputs
	private String shapeType;
	private double length;
	private double width;
	private double radius;
// outputs
	private double area;
	private double perimeter;
	public ShapeCopy6() {
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
		case "S": // square
			area = length * length;
			perimeter = 4 * length;
			width = 0.0;
			radius = 0.0;
			break;
		case "R": // rectangle
			area = length * width;
			perimeter = 2 * (length + width);
			radius = 0.0;
			break;
		case "C": // circle
			area = Math.PI * radius * radius;
			perimeter = 2.0 * Math.PI * radius;
			length = 0.0;
			width = 0.0;
			break;
		default:
			area = 0.0;
			perimeter = 0.0;
			break;
		} // end switch-case on shapeType
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
