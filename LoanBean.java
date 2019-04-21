package edu.uic.ids.console;
import java.util.Scanner;

public class LoanBean {
double principleAmt, downPmt, intRate;
int loanTerm;
double financedAmt, monthlyPmt, totPmts, totInt, totCost;

public LoanBean() {
		principleAmt = 0.0;
		downPmt = 0.0;
		intRate = 0.0;
		loanTerm = 0;	
	}
String computeLoan() {
	double r,n;
	financedAmt = principleAmt - downPmt;
	r= intRate/1200;
	n=loanTerm*12;
	monthlyPmt = financedAmt * (r *Math.pow(1+r, n))/(Math.pow(1+r, n)-1);
	totPmts= financedAmt/monthlyPmt;
	for (int i=0; i <loanTerm;i++) {
		double interest = (intRate * financedAmt * 100) / 100;
		double principalPay =((monthlyPmt - interest) * 100) / 100;
		double principal = ((financedAmt - principalPay) * 100) / 100;
		totInt += interest;
		
	}
	
	totCost = financedAmt+totInt+downPmt;
	
	if(loanTerm>=0) {
		System.out.println("SUCCESS");
		return ("Principle Amt: $"+principleAmt+"\nDown Payment: $"+downPmt+"\nInterest Rate: "+intRate+ "\nLoanTerm: "+loanTerm+"\nFinanced Amt: $" +financedAmt+"\n"+ "Monthly Payment: $"+monthlyPmt+"\n"+ "Total # of Payments: "
							+totPmts+"\n"+"Total Interest: $"+totInt+"\n"+"Total Cost: $"+totCost);
	}
	else {
		return "Something went wrong, make sure all the required data fields are filled correctly";
	}
}
public void createArray(int number){
	
}
public double getDownPmt() {
	return downPmt;
}
public void setDownPmt(double downPmt) {
	this.downPmt = downPmt;
}
public double getIntRate() {
	return intRate;
}
public void setIntRate(double intRate) {
	this.intRate = intRate;
}
public int getLoanTerm() {
	return loanTerm;
}
public void setLoanTerm(int loanTerm) {
	this.loanTerm = loanTerm;
}
public double getPrincipleAmt() {
	return principleAmt;
}
public void setPrincipleAmt(double principleAmt) {
	this.principleAmt = principleAmt;
}



}
