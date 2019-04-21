import java.util.Scanner;

public class TestSwitch {

		void evalValue(int value) {
			switch(value)
			{
			case 3: System.out.println("three");break;
			case 2: System.out.println("two");break;
			case 1:System.out.println("one");break;
			case 0: System.out.println("zero");break;
			default: if (value <0) System.out.println("NEGATIVE");
				else System.out.println("LOTS");
			}
		}
		boolean compareStrings(String str1, String str2) {
			return str1.equals(str2); // equals is a method used to see if these strings are equal
			//there is another way of coding the same thing but its cumbersome
			//if(str1.equals(str2)) // if(str1 == str2)
			//	return true;
			//else
			//	return false
		}
		boolean compareObjects(Object obj1, Object obj2) {
			return obj1 == obj2;
	
		}
		int returnGreatest(int a, int b, int c)
		{
				if(a > b && a > c)
						return a;
				else if(b > c)
					return b;
				else
					return c;
		}
		
		public static void main(String[]args) {
			TestSwitch test = new TestSwitch();
			//I called the functions here to demonstrate
			
			//test.evalValue(5);
			//here you should now call ther scanner to ask the console for input, do it for practice
			System.out.println(test.compareStrings("xyz", "xyz"));
			System.out.println(test.returnGreatest(5, 6, 10));
			
		}
}
