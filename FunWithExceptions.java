import java.util.InputMismatchException;
import java.util.Scanner;
public class FunWithExceptions {
	Scanner scanner;
	FunWithExceptions f;
	int[] array;
	public static void main(String[] args) {
		// cannot create the same object in two places because they are just mirrors of each other, field f has field f and that field f has a field f and that field f has one etc.....
		
		//FunWithExceptions f = new FunWithExceptions(); there is a finite space on the stack, the stack will quit if its repeating the same shit infinitely
		FunWithExceptions f= new FunWithExceptions();
		//f.run();
		//f.run2();
		//run3 can throw an exception so i have to call it from a method 
		try {
		System.out.println(f.run3());
		}
		catch(InputMismatchException e) {
			System.out.println("You need to enter a number, fool.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("bad input!");
		}
		System.out.println("Method call done");
	}
void run()
{
	scanner = new Scanner(System.in);
	int x;
	int index, value;
	try {
		System.out.println("Please enter a number between 1 and 100");
		value =scanner.nextInt();
		System.out.println("Please enter a number between 0 and 99");
		index = scanner.nextInt();
		array[index] = value;
	}
	catch(InputMismatchException e) {
		System.out.println("Oh no, bad input!");
		//print stack trace
		e.printStackTrace();
		return;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid array index!");
	}
	System.out.println("The new value at index " +index + "is "+ value);
	//options without try/catch
	//String s = scanner.next();
	//if s converts to a number, int x = s.
	//int variable = Integer.parseInt(s);
	//options for dealing with exceptions
}

	void run2() {
		String s = null;
	try {
		System.out.println("Please enter your name");
		scanner = new Scanner(System.in);
		s = scanner.next();
		System.out.println("Please enter a number");
		int index = scanner.nextInt();
		String output = "The character at index " + scanner.nextInt() + " is " + s.charAt(index);
		System.out.println("" + output);
	
	}
	catch(Exception e) {
		System.out.println("You have entered an invalid index for your String.");
	}
	//this block is supposed to execute regardless
	finally {
		System.out.println("We realize you have a choice of applications to use");
		System.out.println("We thank you for using our application today");
	}
	}
	String run3() throws InputMismatchException, ArrayIndexOutOfBoundsException{
			String s = null;
			int index;
			System.out.println("Please enter your name");
			//scanner.next will not throw an Exception
			scanner = new Scanner(System.in);
			s = scanner.next();
			//scanner.nextINt() CAN throw an InputMismatchException
			System.out.println("Please enter a number");
			try 
			{
				index=scanner.nextInt();
			}
			catch(InputMismatchException e) 
			{
				throw new InputMismatchException("bad input!");
			}
			
			//s.charAt() can also throw an ArrayIndexOutOfBoundsException
			if(s ==null|| index< 0|| index >= s.length())
				throw new ArrayIndexOutOfBoundsException("bad index!");
			
			return "The character at index " + scanner.nextInt() + " is " + s.charAt(index);
		
	}
}
