package edu.uic.ids.console;

public interface FileBeanInterface {
	public String computeLoan();
	
	public double getPurchasePrice();
	public void setPurchasePrice(double purchasePrice);
	
	public double getDownPmt();
	public void setDownPmt(double downPmt);
	
	public int getLoanTerm();
	public void setLoanTerm(double loanTerm);
	
	public double getIntRate();
	public void setIntRate(double intRate);
	
	public double getMonthlyPayment();
	public double getTotalPayments();
	public double getTotalInterest();
	public double getTotalCost();
	
}
