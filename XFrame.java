/*write a concstructor for a class XFrame that extends JFrame and
*a)gives it the title "This is an XFrame."
*b) sets its size to 600 pixels wide and 400 pixels tall
*c)gives it an arrangement of JPanels: 3 rows, 1 column, where the Panels appear as 3 rows with colors red, orange, and yellow
*2 Write the class definition for class YFrame that extends JFrame and:
*a) has two buttons on a JPanel
*b) when the left button is pressed, the JPanel's background color will be red
*C)when the right button is pressed, the Jpanel's background color will be green
*
*3) Write the class definition for a class ZFrame that extends JFrame and:
*a) has two JTextFields on a JPanel
*b) when the user presses enter in the first JTextField, its text will appear as the title of the ZFrame and the JTextField will be cleared
*c) when the user presses enter in the first JTextField, its text will appear BACKWARD as the title of the ZFframe and the JTextField will be cleared
*/
import javax.swing.*;
import java.awt.*;
public class XFrame extends JFrame{
	JPanel jp;
	JPanel jp1;
	JPanel jp2;
	JPanel jp3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XFrame xf = new XFrame();
		
	}

	XFrame()
	{
		this.setTitle("This is an XFrame");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		jp = new JPanel();
		this.add(jp);
		jp.setLayout(new GridLayout(3,1));
		
		jp1 = new JPanel();
		jp1.setBackground(Color.RED);
		jp.add(jp1);

		jp2 = new JPanel();
		jp2.setBackground(Color.ORANGE);
		jp.add(jp2);
		
		jp3 = new JPanel();
		jp3.setBackground(Color.YELLOW);
		jp.add(jp3);
		this.setVisible(true);
	}
}