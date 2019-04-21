/*
 * author@Sam Schuller

 * 10/5/18
 */ 
import java.util.Scanner;
 
public class InputReader {
	String str1, str2;
	Scanner scn;
	
	public static void main(String[] args) {
		//Instantiating an object of Input Reader thru the main method
		InputReader inreader = new InputReader();
		//The instructions do not ask us to call the method but I called
		//inreader.printInput();
		//inreader.matchEcho();
		//inreader.printProd();
		inreader.printInput();
		inreader.matchEcho();
		inreader.PrintProd();
		
	}	
	void printInput() 
	{
		//first create the scanner object, then ask for input from the console with .next method
		System.out.println("Please enter a string:");
		scn = new Scanner(System.in); 
		str1 = scn.next();
		System.out.println("You entered: " + str1);
	}
	void matchEcho() 
	{
		System.out.println("Please enter a string:");
		scn = new Scanner(System.in);
		str2=scn.next();
		if(str2.equals("echo")) // Or, if (str2 == "echo")
			System.out.println("Match!");
		else 
			System.out.println("Not a match");
	}
	
	void PrintProd() {
		System.out.println("Please enter first int:");
		scn = new Scanner(System.in);
		int int1 = scn.nextInt();
		System.out.println("Please enter second int:");
		int int2 = scn.nextInt();
		System.out.println("The final product:   "+ (int1*int2));
	}
		
}
