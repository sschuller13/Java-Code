package edu.uic.ids.posttest1;
import edu.uic.ids.posttest1.FileBean;
import java.util.Scanner;
public class fileconsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileBean fileBean = new FileBean();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input File: ");
		String inputFileName = sc.next();
		fileBean.setInputFileName(inputFileName);
		
		System.out.println("Output File: ");
		String outputFileName = sc.next();
		fileBean.setOutputFileName(outputFileName);
		String status = fileBean.parseCsvTabSpace();
		String copyStatus = fileBean.performcopy();
		System.out.println("Input file length: "+fileBean.getInputFileLength());
		System.out.println("Input file count: "+fileBean.getCount());

		sc.close();
	}

}
