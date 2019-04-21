package edu.uic.ids.console;
import java.util.Scanner;

public class HelloWorld {
double num1, num2;
Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld Hello = new HelloWorld();
		System.out.println(" Hello world ");
		Scanner scanner = new Scanner(System.in);
		double operand1 = 0;
		double operand2 = 0.0;
		
		double answer =0.0;
		
		System.out.println("Enter Operand 1");
		operand1 = scanner.nextDouble();
		System.out.println("Enter Operand 2");
		operand2 = scanner.nextDouble();
		System.out.println("" +operand1+ " * " +operand2+ " is ");
		answer = operand1*operand2;
		System.out.println("Your answer is "+answer);
		Hello.Adding();
		Hello.Subtracting();
		Hello.Dividing();
		
		scanner.close();
	}
public double Adding() {
	double num3;
	System.out.println("Enter 1st Digit");
	num1 = scan.nextDouble();
	System.out.println("Enter 2nd Digit");

	num2 = scan.nextDouble();
	System.out.println("Here's your answer");

	num3 = num1+num2;
	System.out.println("" + num3);
	return num3;
}
public double Subtracting() {
	double num3;
	System.out.println("Enter 1st Digit");
	num1 = scan.nextDouble();
	System.out.println("Enter 2nd Digit");

	num2 = scan.nextDouble();
	System.out.println("Here's your answer");

	num3 = num1-num2;
	System.out.println("" + num3);
	return num3;
}
public double Dividing() {
	double num3;
	System.out.println("Enter 1st Digit");
	num1 = scan.nextDouble();
	System.out.println("Enter 2nd Digit");

	num2 = scan.nextDouble();
	System.out.println("Here's your answer");

	num3 = num1/num2;
	System.out.println("" + num3);
	return num3;
}

HelloWorld(){
	
}
}
