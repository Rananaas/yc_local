import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class Window extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {

		///colors: 
		Color BROWN_BOARDBASE = new Color(153,102,0);
		
		int YboardLine = 100;
		int XboardLine = 100;
		
		System.out.println("//////////////////////////////////////////////////BASIC PAINTER");
		
		g.setFont(new Font("Monospace", Font.PLAIN, 50));
	    g.drawString("MASTERMIND", 400, 65);
		
		g.setColor(BROWN_BOARDBASE);
		g.fillRect(50,80, 400, 650);
		
		
	   ///super.paintComponent(g); ///(paint over alles heen! voorgaande is pleite)
	    Graphics2D g2 = (Graphics2D) g;
	    g2.setStroke(new BasicStroke(3));
	   
	    
		for (YboardLine = 100; YboardLine < 350 ; YboardLine += 50) { 
			g.setColor(Color.black);
			g.drawLine(YboardLine, 100, YboardLine, 600);
		}
		for (XboardLine = 100; XboardLine < 750 ; XboardLine += 50) { 
			g.setColor(Color.black);
			g.drawLine(100, XboardLine, 300, XboardLine);
		}


		// grid for codeToGuess
		for (YboardLine = 100; YboardLine < 350 ; YboardLine += 50) { 
			g.setColor(Color.black);
			g.drawLine(YboardLine, 650, YboardLine, 700);
		}
		
		Introductie.introPart(g2);

	}
	
	public void paintCode(Graphics g) {
		System.out.println("PAINTING ELEMENTS ETC");

	} 



}
