//Sam Schuller (UIN: 657353888) MWF 2:00pm, Lab Fri 4:00pm
//Due 9/21/18, finished 9/18/18
public class Module1{

	int intField;
	double doubleField;
	
	void launch()
	{
		System.out.println("New object created and inititialized");
	}
	
	public int intSquare(int x)
	{
		intField = x * x;
		return intField;
	} 
	
	public double doubleSquare(double x)
	{
		doubleField = Math.pow(x, 2);
		return doubleField;
	}
	
	public int intCube(int x)
	{
		intField = x * x * x;
		return intField;
	}
	
	public double doubleCube(double x)
	{
		doubleField = Math.pow(x, 3);
		return doubleField;
	}
	
	public static void main(String[] args)
	{
		Module1 obj = new Module1();
		
		obj.launch();
		System.out.println(obj.intSquare(6));
		System.out.println(obj.doubleCube(4.0));
		System.out.println("Computations Completed");		
	}
}

