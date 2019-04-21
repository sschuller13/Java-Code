
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class YFrame extends JFrame implements ActionListener{
	JPanel jp;
	JButton jbred, jbgreen;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YFrame yf = new YFrame();
		
	}

	YFrame()
	{
		this.setTitle("This is an YFrame");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		jp = new JPanel();
		this.add(jp);
		jbred= new JButton("red");
		jbred.addActionListener(this); //have to specify what object is responding to this, now when an event happens you can react from this
		jp.add(jbred);
		jbgreen = new JButton("green");
		jbgreen.addActionListener(this);
		jp.add(jbgreen);
		this.setVisible(true);
	}

	@Override //include this anytime you need an event to happen
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jbred)
		{
			jp.setBackground(Color.RED);
		}
		else if(e.getSource()== jbgreen)
		{
			jp.setBackground(Color.GREEN);
		}
	}
}