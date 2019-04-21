import java.util.Scanner;
public class FunWithArrays {

	int[] numbers;
	static Scanner scanner = new Scanner(System.in);
	static int[][] bigData[] = new int[100][100][];//3D array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter an array size");
		FunWithArrays fwa = new FunWithArrays(scanner.nextInt());
		System.out.println("the array has size "+fwa.numbers.length);
		fwa.endlessLoop();
		
	}

	//this constructor requires an int variable to set the array size
	FunWithArrays(int size){
		numbers = new int[size];
	}
	void displayNumbers() {
		String s = "";
		for(int loop = 0; loop < numbers.length; loop++)
		{
			s +=numbers[loop];
			if(loop<numbers.length - 1) s +=  ", ";
		}
		System.out.println(s);
	}
	void endlessLoop() {
		String input = "";
		while(true)
		{
			scanner = new Scanner(System.in);
			//first command: enter index and value and assign it
			System.out.println("Enter a command");
			input = scanner.nextLine();
			if (input.equals("input"))
			{
					System.out.println("index?");
					int index = scanner.nextInt();
					System.out.println("value?");
					int value = scanner.nextInt();
					numbers [index] = value;
					displayNumbers();
			}
			
			if(input.equals("exit"))
			{
				System.out.println("Ok, all done!");
				System.exit(0);//zero here programs ending without error
				
			}
			//second command: exit
			
		}
	}
}
