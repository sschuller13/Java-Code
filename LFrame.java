//JFrame is the basic class for application windows in Java
import javax.swing.*;
import java.awt.*;
public class LFrame extends JFrame{
	JPanel jp;
	JPanel jp1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LFrame lf = new LFrame();
	}

	LFrame()
	{
		this.setTitle("My Frame");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		jp = new JPanel();
		jp.setBackground(Color.BLUE);
		jp.setLayout(new GridLayout(2,2));
		this.add(jp);
		
		jp1 = new JPanel();
		jp1.setBackground(Color.YELLOW);
		jp.add(jp1);
		this.setVisible(true);
	}
}
