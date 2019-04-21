import java.util.Scanner;
//author and date 
/* now you have a large comment area
 * 
 */
	/**
	 * @author Sam Schuller
	 * Sep 28,2018
	 */
public class Average928 {
	Scanner scanner;
	int count = 0;
	double runningAverage;
	/* a scanner named scanner as a data member, declaration only
	 * an int var named count (starts at 0)
	 * a double variable named runningAverage(declaration only)
	 */
	
	//takes scanner object as parameter, prompts user, declares int, assigns int the value obtained from user via scanner's nextint method
	//returns an int
	
	int recieveInput(Scanner scn) {
		System.out.println("Please enter an integer between 0 and 200");
		int input;
		input =scn.nextInt();
		return input;
	}
	
	//takes two ints as parameters, typecasts the paramters to new double variables, and then returns the sum as a double
	double computeAverage(int sum, int units) 
	{
		double dSum = (double)sum;
		double dUnits = (double)units;
		return dSum/dUnits;
	}
	//inputcycle takes no inputs and returns void, does nothing
	
	void inputCycle() {
		
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Average928 avg = new Average928();
		//avg.inputCycle(); //avg object calls the inputCycle method
		
		Scanner sc = new Scanner(System.in); //creates the scanner object and use average object to call recieve input method 
		int userInput;
		avg.recieveInput(sc);
		
		userInput=avg.recieveInput(sc);
		System.out.println("You entered:" + userInput);
		
	}

}
