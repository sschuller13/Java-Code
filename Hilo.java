import java.util.Scanner;
import java.util.Random;
public class Hilo {
	int[] numbers;
	int maxGuesses;
	int guessesLeft;
	int targetIndex;
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo hl = new Hilo();
		System.out.println("Beginning new Game!");
		boolean b = hl.playGame();
		if(b) System.out.println("Hurray. You win!");
		else System.out.println("You lose, you suck!");
		
	}
	void buildArray()
	{
		int max = 20000000;
		int step = max / numbers.length;// the max gap between numbers
		
		// fill the array such that:
		//each element has a larger value than the preceding one
		//we do this by tracking the value of the previous index and adding a  random portion of step
		// we also guarentee that the array values will not overflow to negative
		Random r = new Random(); // random number generator object
		int value = 0;
		for(int index = 0; index < numbers.length; index++) //gets number from 0 to step-1
		{
			numbers[index]= value + 1+r.nextInt(step);
			value = numbers[index];
			System.out.println("index: " + numbers[index]);
			
		}
	}

	void initialization() 
	{
		System.out.println("What's the array size?");
		numbers = new int[scanner.nextInt()];
		System.out.println("Arrays created with" + numbers.length + "elements");
		System.out.println("How many guesses?");
		maxGuesses = scanner.nextInt();
		guessesLeft = maxGuesses;
		System.out.println("You have " + guessesLeft + " of " + maxGuesses + " remaining");
	}
	
	Boolean playGame() {
		initialization();
		buildArray();
		selectIndex();
		System.out.println("The target numbers is " + numbers[targetIndex]);
		while(guessesLeft > 0) {
			System.out.println("which index do you think holds the value?");
			int guess = scanner.nextInt();
			if(processGuess(scanner.nextInt())) return true;
			else {
				if(numbers[guess]> numbers[targetIndex]) System.out.println("You guessed high");
				else System.out.println("You guessed low");
			}
			guessesLeft --;
		}
		return false;
	}
	boolean processGuess(int guess) {
		return guess == targetIndex;
	}
	void selectIndex() {
		Random r = new Random();
		targetIndex= r.nextInt(numbers.length);
		
	}
}
