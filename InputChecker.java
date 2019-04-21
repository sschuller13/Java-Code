import java.util.Scanner;
public class InputChecker {
	
	boolean isLetterString(String s) {
		for(int index = 0;  index < s.length(); index++)
		{
			char c = s.charAt(index);
			if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) return false;
		}
			return true;
	}
	
	boolean isShortString(String s) throws LongStringException{
		if(s.length() > 8) {
			throw new LongStringException();
		}
		return true;
	}
	public static void main(String[] args) throws DuplicateValueException, LongStringException {
		InputChecker obj = new InputChecker();
		String str = "Ecem";
		//System.out.println(obj.isLetterString(str));
		
		//System.out.println(obj.getCheckedString());
		int value = 1;
		int[] arr = new int[] {2,4,8};
		obj.addUniqueChecker(value,arr);
	}
	
	void addUniqueChecker(int value, int[] array) throws DuplicateValueException{
		for(int index = 0; index < array.length; index ++)
			if(value == array[index])throw new DuplicateValueException();
	}
	
	void addUniqueValue(int value, int[] array) throws DuplicateValueException{
		for(int index =0; index<array.length; index++)
		{
			if(value == array[index]) throw new DuplicateValueException();
		}
	}
	
	boolean getCheckedString()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter a string of all letters, and no more than 8 characters");
		String input = scn.next();
		
		if(!isLetterString(input)) return false;
		
		try {
			isShortString(input);
			return true;
		}
		catch (LongStringException e) {
			return false;			
		}
	}
	
	void getCheckedData(){
		
	}
	
	

}

class LongStringException extends Exception{

}
class DuplicateValueException extends Exception{
	
}
