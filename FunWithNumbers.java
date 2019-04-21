package Class;

public class FunWithNumbers {
	int x;
	double y;
	
	public static void main(String[] args) {
		FunWithNumbers fwn = new FunWithNumbers();
		fwn.dataDump();
		fwn.mathOps();
		int z =fwn.mathOps() * 6; //assigning expression involving method return
	}

	void dataDump()
	{
		System.out.println("x: " +x);
		System.out.println("y: " +y);
	}
	int mathOps()
	{
		int z = 6; //assigning literal value
		z = x +3; //arithmetic expression
		return x;
	}
	FunWithNumbers()
	{
		x = 3;
	}
}
