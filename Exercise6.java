
public class Exercise6 {
int value;
	public static void main(String[] args) {
	//2a
		// TODO Auto-generated method stub
		Exercise6 obj = new Exercise6();
		String[] pizza = new String[5];
		pizza =new String[] {"cheese", "tomato", "pepperoni", "olives", "mushrooms"};
		
		obj.method2a(pizza);
		
		//method 2b
		String[] arr = new String[0];
		arr = new String[] {};
		obj.method2b(arr);
	}	
		
	Object[] method1a(int value)
	{
		Object[] objArr = new Object [value];
		return objArr;
		//return new Object[value]; alternate option for b
	}
	
	Object[] method1b(String[] array) {
		if(value < 0) return null;
		else return new Object[value];
			
		}
	void method2a(String[] array)
	{
		for(int index = 0; index <array.length; index++)
		{
			System.out.println(array[index]);
		}
	}
	void method2b(String[] array)
	{
		if(array.length == 0) System.out.println("no text content to display");
		for(int index=0 ; index < array.length; index++)
		{
			System.out.println(array[index]);
		}
	}

}
