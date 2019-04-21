import java.util.Scanner;
public class FunWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunWithLoops fwl = new FunWithLoops();
		//fwl.getName();
		//fwl.getName2();
		fwl.getName3();
		
		//for(int x=0; x<10; x++)System.out.println(x);
		
		int x= 0, y =1;
		for(; x<10;) {
			
		}
		String s;
		for (int x = 0, y = 1; x < 10; 
		s = "" + "x: " + x + ", + y^2: " + y * y, System.out.println(s)) 
		{
			x++;
			y++;
		}

		
	}
//while loop
	void getName() {
		Scanner input = new Scanner(System.in);
		String s = "";
		boolean isValid = false;
		//intially, isValid == false, so !isValid == true
		while (!isValid) {
			System.out.println("Please enter your name");
			s = input.nextLine();
			//escape loop by setting isvalid to true, o/w repeat the loop
			if(s.length()>0) isValid = true;
		}
		System.out.println("Hello, " +s);
		}
	//uses do while loop
	void getName2() {
		Scanner input = new Scanner(System.in);
		String s = "";
		boolean isValid = false;
		do {
			System.out.println("Please enter your name");
			s = input.nextLine();
			//escape loop by setting isvalid to true, o/w repeat the loop
			if(s.length()>0) isValid = true;
		} while (!isValid);
		System.out.println("Hello, "+s);
	}
	//uses for loop
	void getName3() {
		Scanner input = new Scanner(System.in);
		String s = "";
		for(boolean isValid = false; !isValid;)//notice no post-loop statements
		{
			System.out.println("Please enter your name");
			s = input.nextLine();
			//escape loop by setting isvalid to true, o/w repeat the loop
			if(s.length()>0) isValid = true;
		} 
		System.out.println("Hello, "+s);
	}
}
