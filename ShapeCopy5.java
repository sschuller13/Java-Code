package edu.uic.ids.console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import edu.uic.ids.console.ShapeCopy6;
public class ShapeCopy5 {
	public static void main(String[] args) {
			String continues = "";
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			ShapeCopy6 shape = null;
			String shapeType = "";
			double length = 0.0;
			double width = 0.0;
			double radius = 0.0;
			String delim = null;
			String d = null;
			System.out.println("IDS401 Assignment 5 - Shape Area & Perimeter calculator \n");
			System.out.println("Enter max number of shapes: ");
			int maxNumberShapes = sc.nextInt();
			ShapeCopy6 shapeArray [] = new ShapeCopy6 [maxNumberShapes];
			int Number = 0;
			while(!continues.equalsIgnoreCase("n")) { // assumes at least one
				shape = new ShapeCopy6();
				shapeArray[Number++] = shape;
				System.out.println("Enter type of shape (S for square, R for rectangle, and C for circle: ");
				shapeType = sc.next();
				shape.setShapeType(shapeType);
				switch(shapeType.toUpperCase()) {
				case "S": // square
					System.out.println("Enter length/width of square: ");
					length = sc.nextDouble();
					shape.setLength(length);
					break;
				case "R": // rectangle
					System.out.println("Enter length of rectangle: ");
					length = sc.nextDouble();
					shape.setLength(length);
					System.out.println("Enter width of rectangle: ");
					width = sc.nextDouble();
					shape.setWidth(width);
					break;
				case "C": // circle
						System.out.println("Enter radius of circle: ");
						radius = sc.nextDouble();
						shape.setRadius(radius);;
						break;
					default:
						System.out.println("Bad shape type: " + shapeType);
						Number--;
						continue;
					} // end switch-case on shapeType
					shape.computeShape();
					System.out.println(" Shape type " + shapeType +", length " + shape.getLength() +", width " + shape.getWidth() +
							", radius " + shape.getRadius() +", the area is " + shape.getArea() + "\n" +", and the perimeter is " +
					shape.getPerimeter() + "\n" );
					System.out.println("Do you wish to continue (y/n)?");
					continues = sc.next();
				} 
			System.out.println("Number of shapes processed is " +Number + "\n");
			System.out.println("number\tshape\tlength\twidth\tradius\tarea\tperimeter\n");
			for(int i = 0; i < maxNumberShapes; i++) {
				shape = shapeArray[i];
				if(shape == null)
					continue;
				System.out.println(i + "\t" + shape.getShapeType() + "\t" +
						shape.getLength() + "\t" +
						shape.getWidth() + "\t" +
						shape.getRadius() + "\t" +
						shape.getArea() + "\t\t\t" + shape.getPerimeter());
			}
			System.out.println("Enter the name of the file you would like to export to: ");
			String fileName = sc.next();
			File csvFile = new File(fileName);
			System.out.println("Enter the type of delimeter you want to use: type either(slash, comma, or tab) exactly as they appear here");
			delim = sc2.nextLine();
			if(delim=="tab") {
				d = "/t";
			}
			else if(delim=="slash") {
				d = "/";
			}
			else {
				d = ",";
			}
			try {
				String columns = ("Index,Shape,Length,Width,Radius,Area,Perimeter \n");
				PrintWriter csvWriter = new PrintWriter(new FileWriter(csvFile));
				sc2 = new Scanner(columns);
				String temp = sc2.nextLine();
				csvWriter.print(temp +"	\n");
				String value = null;
				for(int i =0; i < shapeArray.length;i++) {
					String test = (i+d+ shapeArray[i].getShapeType()+d+shapeArray[i].getLength()+d+shapeArray[i].getWidth()+d
							+shapeArray[i].getRadius()+d+shapeArray[i].getArea()+d+shapeArray[i].getPerimeter());
					sc = new Scanner(test);
					value = sc.next();
					csvWriter.print(test+"	\n");
				}
				csvWriter.flush();
				csvWriter.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			finally {
				sc.close();
				sc2.close();
			}
			System.out.println("\n Shape Area-Perimeter calculator complete \n Process completed. Check your Project folder");
			System.exit(0);
}
}