package edu.uic.ids.model;

public class Multiply {
	
	private double operand1;
	private double operand2;
	private double answer;
	

	public Multiply() {
		// TODO Auto-generated constructor stub
		operand1= 0.0;
		operand2= 0.0;
		answer= 0.0;
	}
	
	public Multiply(double operand1, double operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	public void performMultiply() {
		answer = operand1*operand2;
	}


	public double getOperand1() {
		return operand1;
	}


	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}


	public double getOperand2() {
		return operand2;
	}


	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}


	public double getAnswer() {
		return answer;
	}
	
	
}
