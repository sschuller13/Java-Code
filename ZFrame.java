import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ZFrame extends JFrame implements ActionListener{
	JTextField jtf1,jtf2;
	
public static void main (String[] args) {
	ZFrame zf = new ZFrame();
	
}
ZFrame()
{
	this.setTitle("This is a ZFrame");
	this.setSize(600,400);
	JPanel jp = new JPanel();
	this.add(jp);
	jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
	jtf1 = new JTextField(20);
	jtf1.addActionListener(this);
	jtf2 = new JTextField(20);
	jtf2.addActionListener(this);
	jp.add(jtf1);
	jp.add(jtf2);
	this.setVisible(true);
}

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == jtf1)
	{
		this.setTitle(jtf1.getText()); 
	}
	if(e.getSource() == jtf2)
	{
		String s = "";
		int index = s.length()-1;
		while(index >= 0)
		{
			s += jtf2.getText().charAt(index); index--;
		}
		System.out.println(s);
		this.setTitle(s);jtf2.setText("");
	}
}
}
class ZPanel extends JPanel
{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(224,0,224));;//sets the brush to this shade of purple
		
		g.fillRect(10, 100, 110, 110);//first two numbers are starting coordinate, last two are width and height

	}
}