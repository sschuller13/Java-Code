
public class Quiz3CodingQs {
	int value;
	int[] data;
	boolean hasValue(int value, int[] data) {
		
		for (int index = 0; index < data.length; index++)
		{ //if we find a matching value, pop out of the method with true
			if(data[index] == value) return true;
		}
		//otherwise we found no matching value so return false
			return false; 
	}
	//or try this
	boolean hasValue2(int value, int[] data) 
	{
		int index = -1;
		
		//for the do-while loop as written, we need to check for zero length array
		//bc reading from an invalid index will give an error
		if(data.length == 0) return false;
		do {
			index++; if (data[index]== value) return true;
		} while(index < data.length - 1);
		return false;
	}
	
	int sumProduct(int[] array1, int[] array2)
	{
		int total = 0;
		//from the problem we can assume array1.length = array2.length so either can be the loop endpoint
		for(int index = 0; index < array1.length; index++)
		{
			total += array1[index] * array2[index];
			
		}
		return total;
	}

}
