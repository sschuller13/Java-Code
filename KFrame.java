import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//lab 11/2/18
//review for GUI
public class KFrame extends JFrame implements ActionListener{
JPanel jp; 
JButton jb;
boolean isRed;
	
	public static void main(String[] args) {
	
		KFrame kf = new KFrame();
		
	}
	KFrame(){
		jp = new JPanel();
		jp.setBackground(Color.RED);
		this.add(jp);
		
		jb = new JButton("This is your color change button");
		jb.addActionListener(this);
		this.add(jb);
		isRed = true;
		
		setSize(600,400);
		this.setLayout(new GridLayout(2,2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Color Example, Basic Actions in GUI");
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(isRed = true) {
			if(e.getSource() == jb) {
			jp.setBackground(Color.BLUE); 
			isRed = false;
			jb.setText(" Wow this is blue now");
			}
				
		}
		else {
			jp.setBackground(Color.RED);
			isRed = true; 
			jb.setText("Wow it's Red again");
			
		}
	}
		
}
