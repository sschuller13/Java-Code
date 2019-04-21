package edu.uic.ids.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
// when creating class specify JFrame as superclass
// via Browse and enter JFrame and select it
public class BmiUIScreen extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	// these instance variables will also be in the BmiActionListener class
	// as they communicate information between the two classes
	// inputs
	private JTextField units;
	private JTextField weight;
	private JTextField height;
	// outputs
	private JTextField bmi;
	private JTextField bmiPrime;
	private JTextField bmiCategory;
	private BmiActionListener listener;
/*
*
* Exception Class HeadlessException
*
* Thrown when code that is dependent on a
* keyboard, display, or mouse is called in an environment
* that does not support a keyboard, display, or mouse.
*
*/
	public BmiUIScreen() throws HeadlessException {
		// this. // use to see available methods
		setSize(WIDTH, HEIGHT);
		// requires Exit button/action if DO_NOTHING_ON_CLOSE
		// setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// Close via window close as well if EXIT_ON_CLOSE
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI Lab BMI Calculator Application");
		listener = new BmiActionListener();
	}
	public BmiUIScreen(GraphicsConfiguration arg0) {
		super(arg0);
	}
	public BmiUIScreen(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	public BmiUIScreen(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
// TODO Auto-generated constructor stub
	}
	public void process() {
		setLayout(new BorderLayout());
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new GridLayout(0, 2));
		textPanel.add(new JLabel(""));
		textPanel.add(new JLabel(""));	
		textPanel.add(new JLabel("units (English or SI): "));
		units = new JTextField("English");
		units.setBackground(Color.WHITE);
		units.setColumns(16);
		textPanel.add(units);
		textPanel.add(new JLabel("weight (lbs or kg): "));
		weight = new JTextField("");
		weight.setBackground(Color.WHITE);
		weight.setColumns(16);
		textPanel.add(weight);
		textPanel.add(new JLabel("height (inches or meters): "));
		height = new JTextField("");
		height.setBackground(Color.WHITE);
		height.setColumns(16);
		textPanel.add(height);
		textPanel.add(new JLabel(""));
		textPanel.add(new JLabel(""));
		textPanel.add(new JLabel("bmi : "));
		bmi = new JTextField("");
		bmi.setBackground(Color.WHITE);
		bmi.setColumns(16);
		bmi.setEditable(false);
		textPanel.add(bmi);
		textPanel.add(new JLabel("bmiPrime : "));
		bmiPrime = new JTextField("");
		bmiPrime.setBackground(Color.WHITE);
		bmiPrime.setColumns(16);
		bmiPrime.setEditable(false);
		textPanel.add(bmiPrime);
		textPanel.add(new JLabel("bmiCategory : "));
		bmiCategory = new JTextField("");
		bmiCategory.setBackground(Color.WHITE);
		bmiCategory.setColumns(16);
		bmiCategory.setEditable(false);
		textPanel.add(bmiCategory);
		textPanel.add(new JLabel(""));
		textPanel.add(new JLabel(""));
		JButton calculateButton = new JButton("Calculate");
		textPanel.add(calculateButton);
		JButton exitButton = new JButton("Exit");
		textPanel.add(exitButton);
		textPanel.add(new JLabel(""));
		textPanel.add(new JLabel(""));
		add(textPanel, BorderLayout.NORTH);
		// pass instance variables
		listener.setUnits(units);
		listener.setWeight(weight);
		listener.setheight(height);
		listener.setBmi(bmi);
		listener.setBmiPrime(bmiPrime);;
		listener.setBmiCategory(bmiCategory);
		// associate buttons with class that will respond
		calculateButton.addActionListener(listener);
		exitButton.addActionListener(listener);
	}
}
