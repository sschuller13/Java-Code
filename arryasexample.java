
public class arryasexample {
int[]array = {1,2,3,4,5,6};
int[]array2;

int[]numbers = new int[array.length+1];
//suppose i want to insert a new value(4) into index 3
//what i could do is create  a new array of type int and size array.length+1
//then copy over all the old values at indexes before the insert
array = array2;

int[] sizePlusOne(int[] numbers, int n) {
	int[] numbers2 = new int[numbers.length+1];
	for (int loop = 0; loop < numbers.length; loop++)
	{
		numbers2[loop] = numbers[loop];
		numbers2[numbers.length]=n;
		return numbers2; 
		
		
	}
	
}
}
