/*
 * Author: Sam Schuller UIN:657353888 MWF 2pm Lab F 4pm
 *Due:10/12/18 Finished:10/10/18
*/

import java.util.Scanner;
public class Module2 {
	String inputA; 
	String inputB;
	String command;
	Scanner scanner1;
	
	void constructor() 
	{
		inputA = "";
		inputB = "";
		command = "";
	}
	public String getinputstring()
	{
		String reply = "";
		System.out.println("Print a line to the console");
		scanner1 = new Scanner(System.in);
		reply = scanner1.nextLine();
		System.out.println("");
		System.out.println("Thank you");
		
		return reply;
	}
	public String getCommand(String inputA, String inputB) 
	{
		String reply;
		String t = "You didn't enter a valid command, try again";
		String y = "Invalid lines, too few letters. Try actually typing something in please";
		System.out.println("Please enter a command:");
		System.out.println("Your options are concat,firsts, or lasts");
		scanner1 = new Scanner(System.in);
		reply = scanner1.nextLine();
		
		if(reply.equals("concat"))return "" +inputA +inputB;
		else if (inputA.length()<1 || inputB.length()<1) return y;
		else if (reply.equals("firsts")) return "" + inputA.substring(0,1) + inputB.substring(0, 1);
		else if(reply.equals("lasts")) t= "" + inputA.substring(inputA.length()-1, inputA.length()) +inputB.substring(inputB.length()-1, inputB.length());
				return t;
	}
	public static void main (String[] args)
	{
		Module2 object = new Module2();
		object.constructor();
		System.out.println("Starting Application");
		System.out.println("");
		
		String inputA = "" + object.getinputstring();
		System.out.println("You entered: "+inputA);
		System.out.println("");
		
		String inputB= "" + object.getinputstring();
		System.out.println("You entered: "+inputB);
		System.out.println("");
		
		String command = "" +object.getCommand(inputA, inputB);
		System.out.println("");
		System.out.println("Your command results in the formation of: ");
		System.out.println(command);
		System.out.println("");
		
		System.out.println("Now Ending Application");
		System.out.println("Goodbye");
		
	}

}
