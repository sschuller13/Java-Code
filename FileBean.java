package edu.uic.ids.posttest1;
import edu.uic.ids.posttest1.fileconsole;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class FileBean {
	private String inputFileName;
	private String outputFileName;
	private long inputFileLength;
	private int count;
	public FileBean() {
		// TODO Auto-generated constructor stub
	}
	public String performcopy() {
		File inputFile = new File(inputFileName);
		File outputFile = new File(outputFileName);
		
		String status = "SUCCESS";
		inputFileLength = inputFile.length();
		Scanner sc = null;
		PrintWriter printWriter = null;
		String dataLine;
		int count = 0;
		try {
			sc = new Scanner(inputFile);
			printWriter = new PrintWriter(outputFile);
			while(sc.hasNextLine()) {
				dataLine = sc.nextLine();
				printWriter.println(dataLine);
				count++;
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			status = "FileNotFound";
		}
		finally {
			sc.close();
			printWriter.flush();//wipes memory that may be left over
			printWriter.close();
		}
		return status;
	}
	
	public String parseCsvTabSpace() {
		File inputFile = new File(inputFileName);
		File outputFile = new File(outputFileName);
		
		String status = "SUCCESS";
		inputFileLength = inputFile.length();
		
		
		Scanner sc = null; 
		Scanner sc2 = null;
		PrintWriter printWriter = null;
		String dataLine = null;
		count = 0;
		String value = null; 
		try {
			sc = new Scanner(inputFile);
			printWriter = new PrintWriter(outputFile);
			while(sc.hasNextLine()) {
				dataLine =sc.nextLine();
				sc2 = new Scanner(dataLine);
				//sc2.useDelimter("\t"); //tab delimited
				sc2.useDelimiter(",");
				while(sc2.hasNext()) {
					value =sc2.next();
					printWriter.print(value + "		");
				//      SC2->
				// SC #, #, #, #, #
				//  | #, #, #, #, #
				//  v #, #, #, #, #
				}
				printWriter.println();
				count++;
			}
		}
		catch(FileNotFoundException e) {
			status = "FALSE: File not Found";
		}
		catch(IOException e) {
			status = "FALSE: Input Output Exception";
		}
		finally {
			sc.close();
			sc2.close();
			//printWriter.flush();
			printWriter.close();
		}		
		return status;
	}
	public String getInputFileName() {
		return inputFileName;
	}
	public long getInputFileLength() {
		return inputFileLength;
	}
	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}
	public String getOutputFileName() {
		return outputFileName;
	}
	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}
	public int getCount() {
		return count;
	}

}
