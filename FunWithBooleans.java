
import java.util.Scanner;
public class FunWithBooleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b = true;
		String s = new String ("Friday");
		System.out.println("base text");
		System.out.println("what is your text?");
		String t = new Scanner(System.in).next();
		
		System.out.println("Match?" + isMatch(s,t));
		System.out.println("same object?" +isSameObject(s,t));
		int i =1;
		double d =1.0;
		System.out.println("numbers:" + (i ==d));
		
		System.out.println(new FunWithBooleans().displayRank(10));
	}

	static boolean isMatch(String s, String t)
	{
		//test for same content, i.e, matching text
		return s.equals(t);
	}
	static boolean isSameObject(String s, String t)
	{
		s = "Hey.";
		t = "Hey.";
		
		return s == t;
	}
	
	
	private int myInt;
	
	void setMyInt(int value)
	{
		if (value >= 1 && value <= 10) myInt = value;
		else  myInt = 0;
		
 	}
	
	String displayRank(int rating) 
	//same function as if statements, essentially just easier to read
	{
		switch(rating)
		{
		String d = "unranked";
		case 10:return "grandmaster"; break;
		case 9: d += "very";
		case 8: d += "high";
		case 7:return d + "master"; break;
		case 6:return "expert"; break;
		case 5: return "Class A"; break;
		case 4: return "class B"; break;
		case 3: return "asjfd"; break;
		case 2: return "novice"; break;
		case 1: return "beginner"; break;
		default: d = "unranked"; break;
		}
		return d;
	}
}
