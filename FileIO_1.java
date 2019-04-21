package edu.uic.ids.posttest1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileIO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Scanner inputStream = null;
		
		System.out.println("Input File Name: "); //declaration only
		
		String inputFileName = sc.next();
		sc.close();
		
		File inputTextFile = new File(inputFileName);//creating an instance of a file class aka file object
		String inputLine = null; // somewhere to store the input
		int numberLines = 0; //keeps track of number of lines in file
		
		try {
			inputStream = new Scanner(inputTextFile); //instance of file class //example of file input~ C:\Users\s_sch\Documents\solar.txt
			while(inputStream.hasNextLine()) {
				inputLine = inputStream.nextLine();
				numberLines++;
				System.out.println("Line number: "+numberLines);
			}//end while
		}//end try
		catch(FileNotFoundException e){
			System.out.println("Error Detected, could not open/find input file: " +inputFileName);
			System.exit(0);
		}
	}

}
