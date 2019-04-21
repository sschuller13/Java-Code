package edu.uic.ids.console;
import edu.uic.ids.console.LoanBean;
import java.util.Scanner;
public class LoanCalculator_Assignment4 {
double principleAmt, downPmt, intRate;
int loanTerm;
double[] loans;
String example;
LoanBean example1;
Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LoanBean bean = new LoanBean();
		System.out.println("Welcome to the Loan Calculator:");
		System.out.println("How many loans do you want to calculate?");

		int number=sc.nextInt();
		String loans[]= new String[number];
		for(int i=0; i< number;i++) {
			System.out.println("Enter Principle Amt on Loan: ");
			bean.getPrincipleAmt();
			double principleAmt = (sc.nextDouble());
			bean.setPrincipleAmt(principleAmt);

			System.out.println("Enter Down Payment: ");
			bean.getDownPmt();
			double downPmt = (sc.nextDouble());
			bean.setDownPmt(downPmt);

			System.out.println("Enter Interest Rate: (as a decimal)");
			bean.getIntRate();
			double intRate = (sc.nextDouble());
			bean.setIntRate(intRate);
		
			bean.getLoanTerm();
			System.out.println("Enter Loan Term:");
			int loanTerm = (sc.nextInt());
			bean.setLoanTerm(loanTerm);
			loans[i]=bean.computeLoan();
			System.out.println(""+loans[i]);
			System.out.println("Here comes the next loan--");
			}	
		System.out.println("Complete");
		
	}

}
