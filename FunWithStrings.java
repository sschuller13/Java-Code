
public class FunWithStrings {
	char c;
	
	public static void main (String[] args) {
		
		FunWithStrings fws= new FunWithStrings();
		fws.c = 'b';
		System.out.println(fws.c);
		fws.getSubstring(3,8, "Michigan");
		
		//concatenation checks
		System.out.println(("6" + 28)); // concatenation happens
		System.out.println(('6' + 28)); //concatenation doesn't happen
		System.out.println(("6" + 'A')); //concatenation happens with A not its index spot of 65
	}
	
	void runloop() {
		
		for(int index =0; index < 256; index ++)
		{System.out.println("index" + index + ": " + ((char)index));
		}
	}
	
	void example()
	{
		String s = new String("IDS 201");
		//non-literal
		String t = "IDS 201" ;
		//literal string
		
		//non-literal strings don't reuse text
		
	}
	
	String getSubstring (int first, int last, String s) 
	{
		return s.substring(first, last + 1);
		
	}
	
}

