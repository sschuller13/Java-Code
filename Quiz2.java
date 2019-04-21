
public class Quiz2 {
	public static void main(String[] args)
	{
		System.out.println(Q1());
		System.out.println(Q4());
		System.out.println(SA1());
		System.out.println(SA2("Hey There"));

	}
	static String Q1()
	{
		String s = "Universities";
		String t = s.length() +s.substring(3,7);
		return t;
	}
	static int Q4()
	{
		String s = "Albuquerque";
		int t =s.indexOf("que") +s.indexOf("alb");
		//won't return lowercase alb because it can't be found, then it comes back as -1
		return t;
	}
	static String SA1()
	{
		String a = "11";
		int b = 22;
		char c = 'c';
		return (a + b)+(c + a);
	}
	
	static String SA2(String s)
	{
		return ""+ s.charAt(0)+ s.charAt(s.length()-1);
		
		//alternatively use substring method
		// return s.substring(0, 1) + s.substring(s.length-1, s.length());
	}
	
}
