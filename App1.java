/*Author: Sam Schuller, sschul25, UIN:657353888
*Due: 11/19, Completed 11/19
*Prof. Lundquist MWF 2pm Lab F 3pm
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App1 extends JFrame implements ActionListener{
JPanel base, bottomColor;
JLabel jl1,jl2,jl3;
JTextField input1,input2,input3;
JButton jb1,jb2,jb3,jb4,jb5,jb6;
int p1,p2,p3;



	public static void main(String[] args) {
		App1 AppFrame = new App1();
	}

App1()
{
	this.setTitle("RGB Color Changer");
	this.setSize(1000,600);
	this.setLayout(new GridLayout(2,1));
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
	base = new JPanel();
	bottomColor = new JPanel();
	base.setLayout(new GridLayout(1,3));
	this.add(base);
	bottomColor.setBackground(new Color(0,0,0));
	this.add(bottomColor);
		
	
	JPanel part1 = new JPanel();
	part1.setLayout(new GridLayout(4,1));
	
	JPanel part2 = new JPanel();
	part2.setLayout(new GridLayout(4,1));
	JPanel part3 = new JPanel();
	part3.setLayout(new GridLayout(4,1));
	//components from red side
	jb1 = new JButton("(+)");
	jb1.setFont (jb1.getFont ().deriveFont (24.0f));
	jb1.addActionListener(this);
	
	jb2 = new JButton("(-)");
	jb2.setFont (jb2.getFont ().deriveFont (24.0f));
	jb2.addActionListener(this);
	
	input1 = new JTextField(20);
	input1.setFont (input1.getFont ().deriveFont (24.0f));
	input1.addActionListener(this);
	
	jl1 = new JLabel("RED");
	jl1.setBackground(Color.RED);
	jl1.setOpaque(true);
	jl1.setFont (jl1.getFont ().deriveFont (40.0f));
	jl1.setHorizontalAlignment(jl1.CENTER);
	//components for green side
	jb3 = new JButton("(+)");
	jb3.setFont (jb3.getFont ().deriveFont (24.0f));
	jb3.addActionListener(this);
	
	jb4 = new JButton("(-)");
	jb4.setFont (jb4.getFont ().deriveFont (24.0f));
	jb4.addActionListener(this);
	
	input2 = new JTextField(20);
	input2.setFont (input2.getFont ().deriveFont (24.0f));
	input2.addActionListener(this);
	
	jl2 = new JLabel("GREEN");
	jl2.setBackground(Color.GREEN);
	jl2.setOpaque(true);
	jl2.setFont (jl2.getFont ().deriveFont (40.0f));
	jl2.setHorizontalAlignment(jl2.CENTER);
	//components for blue side
	jb5 = new JButton("(+)");
	jb5.setFont (jb5.getFont ().deriveFont (24.0f));
	jb5.addActionListener(this);
	
	jb6= new JButton("(-)");
	jb6.setFont (jb6.getFont ().deriveFont (24.0f));
	jb6.addActionListener(this);
	
	input3 = new JTextField(20);
	input3.setFont (input3.getFont ().deriveFont (24.0f));
	input3.addActionListener(this);
	
	jl3 = new JLabel("BLUE");
	jl3.setBackground(Color.BLUE);
	jl3.setOpaque(true);
	jl3.setFont (jl1.getFont ().deriveFont (40.0f));
	jl3.setHorizontalAlignment(jl3.CENTER);
	
	base.add(part1);
	base.add(part2);
	base.add(part3);
	
	part1.add(jl1);
	part1.add(jb1);
	part1.add(jb2);
	part1.add(input1);
	input1.setText("0");
	
	part2.add(jl2);
	part2.add(jb3);
	part2.add(jb4);
	part2.add(input2);
	input2.setText("0");
	
	part3.add(jl3);
	part3.add(jb5);
	part3.add(jb6);
	part3.add(input3);
	input3.setText("0");
	
	this.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	int rValue=0, gValue=0, bValue=0; 
    String rDisplay, gDisplay, bDisplay;
	
    if(e.getSource() == jb1) {
		rDisplay = input1.getText();
		rValue = Integer.parseInt(rDisplay);
		if(rValue>=255 || rValue < 0) {
			JOptionPane.showMessageDialog(null, "Please enter a number between 0 and 255!");
	          input1.setText("0");
	          input2.setText("0");
	          input3.setText("0");
	          p1 = 0;
	          p2 = 0;
	          p3 = 0;
	          bottomColor.setBackground(new Color(p1,p2,p3));
		}
		else {
			//creates a new color using the values inputed by the user
			rValue ++;
			rDisplay = "" +rValue;
			input1.setText("" + rValue);
			Color newColor = new Color(rValue, p2, p3);
			//sets the color to the one created from user values
	        bottomColor.setBackground(newColor);
	        p1 = rValue;
		}
		}
	
    
    else if (e.getSource() == jb2) {
		rDisplay = input1.getText();
		rValue = Integer.parseInt(rDisplay);
		if(rValue>255 || rValue <= 0) {
			JOptionPane.showMessageDialog(null, "Please enter a number between 0 and 255!");
	          input1.setText("0");
	          input2.setText("0");
	          input3.setText("0");
	          p1 = 0;
	          p2 = 0;
	          p3 = 0;
	          bottomColor.setBackground(new Color(p1,p2,p3));
		}
		else {
			rValue --;
			rDisplay = "" +rValue;
			input1.setText("" + rValue);
			Color newColor = new Color(rValue,p2,p3);
	        bottomColor.setBackground(newColor);
	        p1 = rValue;
		}
	}
	
    
    else if (e.getSource() == jb3) {
		gDisplay = input2.getText();
		gValue = Integer.parseInt(gDisplay);
		if(gValue>=255 || gValue < 0) {
			JOptionPane.showMessageDialog(null, "Please enter a number between 0 and 255!");
	          input1.setText("0");
	          input2.setText("0");
	          input3.setText("0");
	          p1 = 0;
	          p2 = 0;
	          p3 = 0;
	          bottomColor.setBackground(new Color(p1,p2,p3));
		}
		else {
			gValue ++;
			gDisplay = "" +gValue;
			input2.setText("" + gValue);
			Color newColor = new Color(p1,gValue,p3);
	        bottomColor.setBackground(newColor);
	        p2 = gValue;
		}
	}
	
    
    else if(e.getSource() ==jb4) {
		gDisplay = input2.getText();
		gValue = Integer.parseInt(gDisplay);
		if(gValue>255 || gValue <= 0) {
			JOptionPane.showMessageDialog(null, "Please enter a number between 0 and 255!");
	          input1.setText("0");
	          input2.setText("0");
	          input3.setText("0");
	          p1 = 0;
	          p2 = 0;
	          p3 = 0;
	          bottomColor.setBackground(new Color(p1,p2,p3));
		}
		else {
			gValue --;
			gDisplay = "" +gValue;
			input2.setText("" + gValue);
			Color newColor = new Color(p1,gValue,p3);
	        bottomColor.setBackground(newColor);
	        p2 = gValue;
		}
	}
	
    
    else if(e.getSource() ==jb5) {
		bDisplay = input3.getText();
		bValue = Integer.parseInt(bDisplay);
		if(bValue>=255 || bValue < 0) {
			JOptionPane.showMessageDialog(null, "Please enter a number between 0 and 255!");
	          input1.setText("0");
	          input2.setText("0");
	          input3.setText("0");
	          p1 = 0;
	          p2 = 0;
	          p3 = 0;
	          bottomColor.setBackground(new Color(p1,p2,p3));
		}
		else {
			bValue ++;
			bDisplay = "" +bValue;
			input3.setText("" + bValue);
			Color newColor = new Color(p1,p2,bValue);
	        bottomColor.setBackground(newColor);
	        p3 = bValue;
		}
	}
	
    
    else if(e.getSource() ==jb6) {
		bDisplay = input3.getText();
		bValue = Integer.parseInt(bDisplay);
		if(bValue>255 || bValue <= 0) {
			JOptionPane.showMessageDialog(null, "Please enter a number between 0 and 255!");
	          input1.setText("0");
	          input2.setText("0");
	          input3.setText("0");
	          p1 = 0;
	          p2 = 0;
	          p3 = 0;
	          bottomColor.setBackground(new Color(p1,p2,p3));
	          
		}
		else {
			bValue --;
			bDisplay = "" +bValue;
			input3.setText("" + bValue);
			Color newColor = new Color(p1,p2,bValue);
	        bottomColor.setBackground(newColor);
	        p3= bValue;
		}
	}
	
    
    else if (e.getSource() == input1) {
		String r = input1.getText();
		rValue=Integer.parseInt(r);
		if(rValue > 255 || rValue < 0 )
        {
          JOptionPane.showMessageDialog(null, "Please enter a number between 0 and 255!");
          input1.setText("0");
          input2.setText("0");
          input3.setText("0");
          p1 = 0;
          p2 = 0;
          p3 = 0;
          bottomColor.setBackground(new Color(p1,p2,p3));
        }
         else
         {
        Color newColor = new Color(rValue,p2,p3);
          JOptionPane.showMessageDialog(null, newColor);
          bottomColor.setBackground(newColor);
          p1 = rValue;
         
         }
		
	}
	
    
    else if (e.getSource() ==input2) {
		String g = input2.getText();
		gValue=Integer.parseInt(g);
		if(gValue > 255 || gValue < 0 )
        {
          JOptionPane.showMessageDialog(null, "Please enter a number between 0 and 255!");
          input1.setText("0");
          input2.setText("0");
          input3.setText("0");
          p1 = 0;
          p2 = 0;
          p3 = 0;
          bottomColor.setBackground(new Color(p1,p2,p3));
        }
         else
         {
        Color newColor = new Color(p1,gValue,p3);
          JOptionPane.showMessageDialog(null, newColor);
          bottomColor.setBackground(newColor);
          p2 = gValue;
         }
	}
	
    
    else if (e.getSource() ==input3) {
		String b = input3.getText();
		bValue=Integer.parseInt(b);
		if(bValue > 255 || bValue < 0 )
        {
          JOptionPane.showMessageDialog(null, "Please enter a number between 0 and 255!");
          input1.setText("0");
          input2.setText("0");
          input3.setText("0");
          p1 = 0;
          p2 = 0;
          p3 = 0;
          bottomColor.setBackground(new Color(p1,p2,p3));
        }
         else
         {
        Color newColor = new Color(p1,p2,bValue);
          JOptionPane.showMessageDialog(null, newColor);
          bottomColor.setBackground(newColor);
          p3 = bValue;
         }
	}
}
}

