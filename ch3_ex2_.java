package edu.uic.ids.console;
import java.util.Scanner;
import java.text.NumberFormat;
public class ch3_ex2_ {
Scanner sc;
double length,width;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Area and Perimeter Calculator\n");
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		double length = sc.nextDouble();
		System.out.println("Enter Width");
		double width = sc.nextDouble();
		double area = length*width;
		double perimeter = (2*length)+(2*width);
		System.out.println("Area: " +area);
		System.out.println("Perimeter: "+perimeter);
		
		
		System.out.println("Continue? (y/n): ");
		
		if(sc.next().equalsIgnoreCase("n")) {
			System.out.println("Goodbye!");
			break;
		}
		}
		System.out.println("\n Area and Perimeter Calculator Closing\n");
	}

}

