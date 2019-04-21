package edu.uic.ids.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import edu.uic.ids.model.BmiBean;
// On new class go to Interfaces and click in dialog area
// select Add, type ActionListener and select it
public class BmiActionListener implements ActionListener {
// note that these correspond to instance variables in BmiUIScreen class
// will need only setters for them
// inputs
	private JTextField units;
	private JTextField weight;
	private JTextField height;
// outputs
	private JTextField bmi;
	private JTextField bmiPrime;
	private JTextField bmiCategory;
	public BmiActionListener() {
		// TODO Auto-generated constructor stub
	}
	@Override
	// changed default arg0 to e here
	// this is the method that will respond to action button
	//necessary for any class w Action Listeners
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		double w = 0.0;
		double h = 0.0;
		if(action.equalsIgnoreCase("Exit")) {
			System.exit(0);
		}
		else { // form data String -> convert to double
			w = Double.parseDouble(weight.getText());
			h = Double.parseDouble(height.getText());
		}
		BmiBean bmiBean = new BmiBean(units.getText(), w, h);
		bmiBean.computeBmi();
		bmi.setText(Double.toString(bmiBean.getBmi()));
		bmiPrime.setText(Double.toString(bmiBean.getBmiPrime()));
		bmiCategory.setText(bmiBean.getBmiCategory());
	} // end action performed method
	public void setUnits(JTextField units) {
		this.units = units;
	}
	public void setWeight(JTextField weight) {
		this.weight = weight;
	}
	public void setheight(JTextField height) {
		this.height = height;
	}
	public void setBmi(JTextField bmi) {
		this.bmi = bmi;
	}
	public void setBmiPrime(JTextField bmiPrime) {
		this.bmiPrime = bmiPrime;
	}
	public void setBmiCategory(JTextField bmiCategory) {
		this.bmiCategory = bmiCategory;
	}
}
