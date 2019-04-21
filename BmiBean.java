package edu.uic.ids.model;
import java.io.Serializable;
public class BmiBean implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	// inputs
	private String units;
	private double weight;
	private double height;
	private String user;
	// outputs
	private double bmi;
	private double bmiPrime;
	private String bmiCategory;
	private String errorMessage;
	// control
	private boolean status;
	// constants
	private static double siConstant = 1.0;
	private static double imperialConstant = 703.0;
	public static double bmiUpperLimit = 25.0;
	public static double categoryLimit [] = {0.0, 15.0, 16.0, 18.5, 25.0, 30.0, 35.0, 40.0};
	public static String categoryDescription [] =
		{ "Error", "Very severely underweight", "Severely underweight", "Underweight", "Normal (healthy weight)",
				"Overweight", "Obese Class I (Moderately obese)", "Obese Class II (Severely obese)", "Obese Class III (Very severely obese)" };
	public BmiBean() {
		// TODO Auto-generated constructor stub
		errorMessage = "";
		bmiCategory = "";
		units = "English";
	}
	public BmiBean(String units, double weight, double height) {
		super();
		this.units = units;
		this.weight = weight;
		this.height = height;
	}
	public void init() {
// initialization code, if any
		units = "English";
	}
	public BmiBean clone() throws CloneNotSupportedException {
		BmiBean cloned = (BmiBean) super.clone();
		return cloned;
	}
	public String computeBmi() {
		String statusCode = "FAIL";
		status = false;
// additional checking needed
		if( (height <= 0.0) || (weight <= 0.0) ) {
			errorMessage = "Bad input data for weight or height";
			bmi = 0.0;
		} // end if
		else {
			double constant = siConstant;
			if(!units.equalsIgnoreCase("SI"))
				constant = imperialConstant;
				errorMessage = "";
				bmi = constant * weight / (height * height);
				status = true;
				statusCode = "SUCCESS";
			} // end else
	bmiPrime = bmi / bmiUpperLimit;
	bmi = MathUtil.round(bmi, 10.0);
	bmiPrime = MathUtil.round(bmiPrime, 100.0);
	bmiCategory =
			categoryDescription[categoryDescription.length-1];
	for(int i = 0; i < categoryLimit.length; i++) {
		if(bmi <= categoryLimit[i]) {
			bmiCategory = categoryDescription[i];
			break;
		} // end if
	} // end for
	return statusCode;
	} // end computeBmi
	public String getUnits() {
		return units;
		}
	public void setUnits(String units) {
		this.units = units; }
	public double getWeight() {
		return weight; }
	public void setWeight(double weight) {
		this.weight = weight; }
	public double getHeight() {
		return height; }
	public void setHeight(double height) {
		this.height = height; }
	public double getBmi() {
		return bmi; }
	public void setBmi(double bmi) {
		this.bmi = bmi; }
	public double getBmiPrime() {
		return bmiPrime; }
	public void setBmiPrime(double bmiPrime) {
		this.bmiPrime = bmiPrime; }
	public String getBmiCategory() {
		return bmiCategory; }
	public void setBmiCategory(String bmiCategory) {
		this.bmiCategory = bmiCategory; }
	public String getErrorMessage() {
		return errorMessage; }
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage; }
	public boolean isStatus() {
		return status; }
	public String getUser() {
		return user; }
	public void setUser(String user) {
		this.user = user; }
} // end class BmiBean

