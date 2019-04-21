import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZFrame2 extends JFrame implements ActionListener{
	JButton jb1,jb2,jb3;
	ZPanel2 zp2 = new ZPanel2();
	
	ZPanel2 zpa = new ZPanel2(1); //by default appears with a triagnle
	ZPanel2 zpb = new ZPanel2(2);//by default appears with a circle
	
public static void main (String[] args) {
	ZFrame2 zf = new ZFrame2();
	
}
ZFrame2()
{
	this.setTitle("This is a ZFrame2");
	this.setSize(600,400);
	zp2 = new ZPanel2();
	this.add(zp2);
	
	jb1 = new JButton("Triangle");
	jb1.addActionListener(this);
	jb2 = new JButton("Circle");
	jb2.addActionListener(this);
	zp2.add(jb1);
	zp2.add(jb2);
	jb3 = new JButton("Flip");
	jb3.addActionListener(this);
	zp2.add(jb3);
	this.setVisible(true);
}

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == jb1)
	{
		zp2.code = 1;
		zp2.repaint();
	}
	if(e.getSource() == jb2)
	{
		zp2.code = 2;
		zp2.repaint();//to refresh the graphics on the zp2 object
	}
	if(e.getSource() == jb3) {
		if(zp2.code == 1) {
			this.remove(zp2);
			add(zpb);
			zpb.add(jb3);
			validate(); // need validate when you change the compenent higharchy, aka removing a zPanel2 and replacing it with another, like this .
			repaint(); // if you're changing a PROPERTY of an object, you don't need to call repaint. 
		}
		else if (zp2.code == 2) {
			this.remove(zp2);
			add(zpa);
			zpa.add(jb3);
			validate();
			repaint();
		}
	}
}
}

class ZPanel2 extends JPanel
{
	int code = 0; //holds 3 states; 0 for blank, 1 for triangle, 2 for circle
	
	ZPanel2()
	{
		code = 0;
	}
	ZPanel2(int value){
		code = value;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		if(this.code == 1) {
			int[] x = {200,300,100};
			int[] y = {100,300,300};
			g.fillPolygon(x, y, 3);
		}
		
		else if(this.code == 2) {
			g.fillOval(200, 200, 200, 200);
		}
		else if(this.code == 0) {
			
				  Graphics2D g2d = (Graphics2D) g;
				  for (int i = 1; i <= 20; i++) {
					  AlphaComposite a; //meshes color patterns together
					  a = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, i * 0.05f);
					  g2d.setComposite(a);
					  g2d.fillRect(25 * i, 20, 25, 220);				   
				}
				  Font f = new Font("Verdana", Font.BOLD, 32);
				  g.setFont(f);
				  g.drawString("Here is some text", 200, 300);
				  f = new Font("Cambria", Font.ITALIC,24);
				  g.setFont(f);
				  g.drawString("more text", 200, 360);
		}
		

	}
}
