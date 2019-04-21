//write a method that accepts a parameter String named s and returns the length of s as a byte
public class practice2 {

	public byte blegh(String S)
	{
		return (byte)s.length();
		
	}
	//write a method that accepts two ints named x and y and returns the greater one as an int.
	
	public int greater(int x, int y)
	{
		if (x >y) return x;
		else return y;
	}
	
	//write a method that accepts a string parameter and returns its first three characters as a string
	 String bob(String f) {
		return f.substring(0,3);
	}
	 
	 boolean hasNegative (int x, int y) {
		 return (x < 0 || y <0);
		 
	 }
	 //write a method that accepts a char and a string as parameters and returns true if the string starts with the char and false otherwise
	 boolean method(char c, String s)
	 {
		 return (s.startsWith("" +c));
	 }
}
