
public class Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("problem 1: ");
		p1();
		
		System.out.println("\nproblem 2: ");
		p2();
		
		System.out.println("\nproblem 3: ");
		p3();
		
		System.out.println("\nproblem 4: ");
		p4();
	}
	
	static void p1()
	{
		int x = 0;
		int y = 5;
		if (x >= 0) y = 1;
		if (x > 0) x = 2;
		else y = 3;
		x++;
		int z = x + y;
		System.out.println(z);
	}

	static void p2()
	{
		int x = 1;
		int y = 4;
		x = x + 2;
		if (x >= 3) y = 6;
		if (y > 4) x = 5;
		else y = 3;
		int z = x + y;
		System.out.println(z);
	}
	
	static void p3()
	{
		int x = 2;
		int y = 5;
		if (x < 4) x = x / 2;
		if (x <= 1) {
		    y = 2;
		    if (x > 0) y = 4;
		}
		else y = 5;
		int z = x + y;
		System.out.println(z);
	}
	
	static void p4()
	{
		int n = 1;
		int p = 3;
		switch(n) {
			case 0: p = p * 2;
			break;
			case 1: p = p + 2;
			case 2: p = p * 2;
			break;
			case 3: p = p / 2;
			default: p = p - 1;
		}
		System.out.println(p);
	}
}
