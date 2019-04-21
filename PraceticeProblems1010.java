import java.util.Scanner;

public class PraceticeProblems1010 {

	int max;
	int size;
	Scanner scn;
	
	
	void practice(int max) {
		int sum = 0;
		for(int x =1; x < max; x++) sum += x;
		System.out.println(sum);
	}
	//OR
	void method(int max)
	{
		int sum = 0;
		for(; max >0; max--) sum += max;
		System.out.println(sum);
		
	}
	
	void characters(Scanner scn, int size) {
		String s = "";
		do {
			System.out.println("Please enter a string");
			s = scn.nextLine();
		} while(s.length() != size);
		
	}
	//what is z after this?
	
	
	public static void main(String [] args) {
		PraceticeProblems1010 object = new PraceticeProblems1010();
		
		System.out.println(object.practice());
		
		
		//what is z after this?? for iteration of the outer loop (x), I complete a full set of iterations for the inner loop (y)
		//whic means: multiplication, the total iterations of the inner loop is just a product of the iterations
		//so 9 *10 =90, final value of z would be 91
		int z =1;
		for(int x=0; x <9; x++) // will iterate 9 times
		{
			for(int y =0; y <10; y++) z++; //will iterate 10 times
		}
	}
}
