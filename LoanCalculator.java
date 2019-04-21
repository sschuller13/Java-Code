package edu.uic.ids.console;
import edu.uic.ids.console.LoanBean;
import java.util.Scanner;
public class LoanCalculator {
double principleAmt, downPmt, intRate;
int loanTerm;
Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LoanBean bean = new LoanBean();
		System.out.println("Welcome to the Loan Calculator:");
		System.out.println("Enter Principle Amt on Loan: ");
		bean.getPrincipleAmt();
		double principleAmt = Double.parseDouble(sc.nextLine());
		bean.setPrincipleAmt(principleAmt);

		System.out.println("Enter Down Payment: ");
		bean.getDownPmt();
		double downPmt = Double.parseDouble(sc.nextLine());
		bean.setDownPmt(downPmt);

		System.out.println("Enter Interest Rate: (as a decimal)");
		bean.getIntRate();
		double intRate = Double.parseDouble(sc.nextLine());
		bean.setIntRate(intRate);
		
		bean.getLoanTerm();
		System.out.println("Enter Loan Term:");
		int loanTerm = Integer.parseInt(sc.nextLine());
		bean.setLoanTerm(loanTerm);
		
		System.out.println(""+bean.computeLoan());
		

		System.out.println("Complete");
		
	}

}
