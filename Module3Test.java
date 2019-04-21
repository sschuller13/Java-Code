import java.util.Scanner;

public class Module3Test {
	Scanner reader = new Scanner(System.in);
	String array = "";
	public int[] data = new int [0];
	public int[] dataUser;
	public int[] dataInputs;
	public int[] dataFiltered;
	public int[] dataResized;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Module3Test object = new Module3Test();
		System.out.println("Starting Application");
		object.getCommand();
	}
	
	void getCommand()
	{
		String command = "";
		Module3Test action = new Module3Test();
		while(!(command.equals("exit"))) {
		System.out.println("Enter one of the following commands: input, display, filter, resize, exit");
		command = reader.nextLine();
			if(command.equals("input")) 
			{
			dataUser = action.getInput(data);
			action.displayContents(dataUser);
			}
			else if(command.equals("display")) action.displayContents(dataUser);
			else if(command.equals("filter")) 
			{
				int[] temp =action.removeEven(dataUser);
				action.displayContents(temp);
							}
			else if(command.equals("resize")) 
			{
				int[] temp = action.resize(dataUser);
				action.displayContents(temp);
			
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
	public int[] getInput(int[] data) {
		System.out.println("Enter a new number to add to your data");
		int lastDigit = reader.nextInt();
		int[]dataInputs = new int[(data.length+1)];
		for (int loop = 0; loop < dataUser.length;loop++) 
		{
		dataInputs[loop] = lastDigit;
		}
		return dataInputs;
	}
	void displayContents(int[] data) {
		if(data.length>1) {
			for(int loop = 0; loop < data.length-1; loop++)
			{
				array +=data[loop];
				if(loop<data.length) array +=  ", ";
			}
		}
		else if (data.length<=1) {
			for(int loop = 0; loop < data.length; loop++)
			{
				array +=data[loop];
				if(loop<data.length) array +=  ", ";
			}
		}
			System.out.println(array);
		}
	public int[] removeEven(int[] data) {
		
		int i, j;
	    for (i=j=0; i < data.length; i++)
	        if (data[i] % 2 == 0) j++;
	    int[] r = new int[j];
	    for (i=j=0; i < data.length; i++)
	        if (data[i] % 2 == 0) r[j++] = data[i];
	    
	    return r;
	}
}
