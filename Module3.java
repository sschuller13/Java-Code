/*
 * Author: Sam Schuller UIN: 657353888
 * Date Due: 10/29/18 Date Completed:10/29/18
 */
import java.util.Arrays;
import java.util.Scanner;

public class Module3 {
	Scanner reader = new Scanner(System.in);
	String array = "";
	static String lastDisplay;
	public int[] data = new int[0];
	public int[] copy;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Module3 object = new Module3();
		System.out.println("Starting Application");
		object.getCommand();
	}
	
	void getCommand()
	{
		String command = "";
		int count = 0;
		Module3 action = new Module3();
		while(!(command.equals("exit"))) {
		System.out.println("Enter one of the following commands: input, display, filter, resize, exit");
		command = reader.nextLine();
			if(command.equals("input")) 
			{		
				if(count == 0) 
				{
					data = action.getInput(data);
					count++;
						}
				else
					data= action.getInput(data);
			}
			else if(command.equals("display")) {
				System.out.println(lastDisplay);
			}
			else if(command.equals("filter")) 
			{
				data = action.removeEven(data);
			}
			else if(command.equals("resize")) {
				data = action.resize(copy);
			}
			else {
				System.out.println("Exiting page, no commands for you I guess");
				System.exit(0);
				}
			System.out.println("");
			command = "";
			
	}
		System.exit(0);
	}
	 int[] getInput(int[] data) {
			
		System.out.println("Enter a new number to add to your data");
		copy = Arrays.copyOf(data, data.length+1);
		int lastDigit = reader.nextInt();
		for (int loop = 0; loop < copy.length;loop++) 
				{
					copy[copy.length-1] = lastDigit;

				}
			Module3 act = new Module3();
			    
			act.displayContents(copy);
		
			
		return copy;
	}
	public void displayContents(int[] data) {
		for(int loop = 0; loop <= data.length-1; loop++)
		{
			array +=data[loop];
			if(loop<data.length-1) array +=  ", ";
		}
		System.out.println(array);
		lastDisplay = array;
		
	}
	public int[] removeEven(int[] data) {
		System.out.println("This will now remove the Even numbers from your array");
		System.out.println("Calculating....");
		System.out.println("");
		System.out.println("");
		System.out.println("Your array has now been filtered");
		int i, j;
	    for (i=j=0; i < data.length; i++)
	        if (data[i] % 2 == 1) j++;
	    int[] odds = new int[j];
	    for (i=j=0; i < data.length; i++)
	        if (data[i] % 2 == 1) {
	        	odds[j] = data[i];
	        	j++;
	        }
	    Module3 act = new Module3();
	    
	    act.displayContents(odds);
	    return odds;
	}
	public int[] resize (int[] data) {
		Module3 obj = new Module3();
		System.out.println("Enter a new size for your array");
		int newSize = reader.nextInt();
		int[]diffSize = new int[newSize];
		System.out.println("This will now resize your array");
		System.out.println("Calculating....");
		System.out.println("");
		System.out.println("");
		System.out.println("Your array has now been resized");
		if(diffSize.length <= copy.length) {
			for(int loop = 0; loop < diffSize.length; loop++)
			{
				diffSize[loop] = copy[loop];
			}
		}
		else if(diffSize.length>copy.length) {
			for (int loop = 0; loop < copy.length; loop++) 
				{
					diffSize[loop] = copy[loop];
					
				}
	
			}
		
		obj.displayContents(diffSize);
		return diffSize;
	}
}