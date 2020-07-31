import java.awt.Graphics;

import javax.swing.JPanel;


public class Renderer extends JPanel{
	private static final long serialVersionUID = 1L;
	
	// RENDERINGClass for refreshing:
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Introductie.introPart(g);
		Window.paint(g);
	
		
		//Game.game.repaint(g);
		
		System.out.println("IN RENDERER!!!!");
	}
//
	public void introPart(Graphics g) {
		super.paintComponent(g);
		Introductie.introPart(g);
		
	}

}