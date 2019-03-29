package hashMap;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Traffic extends Applet {
	
	public void paint(Graphics g) {
		
		g.setColor(Color.black);
		g.drawRect(30,25,70,120);
		for(;;)
		{
			
			g.setColor(Color.black);
			g.fillOval(50, 30, 30, 30);
			g.setColor(Color.black);
			g.fillOval(50, 70, 30, 30);
			g.fillOval(50, 110, 30, 30);
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			g.setColor(Color.red);
			g.fillOval(50, 30, 30, 30);
			g.setColor(Color.black);
			g.fillOval(50, 70, 30, 30);
			g.fillOval(50, 110, 30, 30);
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			g.setColor(Color.black);
			g.fillOval(50, 30, 30, 30);
			
			g.setColor(Color.yellow);
			g.fillOval(50, 70, 30, 30);
			g.setColor(Color.black);
			g.fillOval(50, 110, 30, 30);
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			g.setColor(Color.black);
			g.fillOval(50, 30, 30, 30);
			g.fillOval(50, 70, 30, 30);
			g.setColor(Color.green);
			
			g.fillOval(50, 110, 30, 30);
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}




