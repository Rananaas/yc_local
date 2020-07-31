
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Introductie extends Window implements KeyListener, MouseListener{


	
	public boolean showColor1Selected = false;
	public boolean showColor2Selected = false;
	public boolean showColor3Selected = false;
	public boolean showColor4Selected = false;

	public static int xPosRect1 = 610;
	public static int xPosRect2 = 720;
	public static int xPosRect3 = 830;
	public static int xPosRect4 = 940;
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public static void introPart(Graphics g) { 

	
			g.setFont(new Font("Monospace", Font.PLAIN, 20));
			int xIntroText = 600;
			g.drawString("WELKOM BIJ MASTERMIND", xIntroText+10, 150);
			g.drawString("NEED HELP? Hit 'H' to read how the game works", xIntroText+10, 175);
			g.drawString("Speler 1 mag een code invoeren...", xIntroText+10, 300);
			
			g.setColor(Color.RED);
			g.drawString("Typ 1 voor ROOD", xIntroText+10, 500);
			g.setColor(Color.GREEN);
			g.drawString("Typ 2 voor GROEN ", xIntroText+10, 525);
			g.setColor(Color.BLUE);
			g.drawString("Typ 3 voor BLAUW ", xIntroText+10, 550);
			g.setColor(Color.YELLOW);
			g.drawString("Typ 4 voor GEEL", xIntroText+10, 575);
			g.setColor(Color.PINK);
			g.drawString("Typ 5 voor ROZE ", xIntroText+10, 600);
			g.setColor(Color.ORANGE);
			g.drawString("Typ 6 voor ORANJE", xIntroText+10, 625);
			
			// drawing boxesForEnterCodeToGuess:
			g.setColor(Color.black);
			
			g.drawRect(xPosRect1,315, 100, 100);
			g.drawRect(xPosRect2, 315, 100, 100);
			g.drawRect(xPosRect3, 315, 100, 100);
			g.drawRect(xPosRect4, 315, 100, 100);
			
			g.setFont(new Font("Monospace", Font.PLAIN, 45));
			String showColor1 = " ? ";
			String showColor2 = " ? ";
			String showColor3 = " ? ";
			String showColor4 = " ? ";
			
			g.drawString(showColor1, xIntroText+ 35, 400);
			g.drawString(showColor2, xIntroText+ 145, 400);
			g.drawString(showColor3, xIntroText+ 255, 400);
			g.drawString(showColor4, xIntroText+ 370, 400);
			
			g.drawString(showColor1,100, 690);
			g.drawString(showColor2, 150, 690);
			g.drawString(showColor3, 200, 690);
			g.drawString(showColor4, 250, 690);
			

} 
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				// WORKS: //System.out.println("KLIKKERD");
				//System.out.println("position click of mouse is : "+ x + " " + y);
				if(x >= xPosRect1 && x <= xPosRect1+100 && y >= 315 && y <=415) {
					showColor1Selected = true;
					showColor2Selected = false;
					showColor3Selected = false;
					showColor4Selected = false;
					String showColor1 = " ... ";
					System.out.println("SEL 1");

					//renderer.paintComponent(g);
				}
				if(x >= xPosRect2 && x <= xPosRect2+100 && y >= 315 && y <=415) {
					showColor1Selected = false;
					showColor2Selected = true;
					showColor3Selected = false;
					showColor4Selected = false;
					String showColor2 = " ... ";
					System.out.println("SEL 2");
				}
				if(x >= xPosRect3 && x <= xPosRect3+100 && y >= 315 && y <=415) {
					showColor1Selected = false;
					showColor2Selected = false;
					showColor3Selected = true;
					showColor4Selected = false;
					String showColor3 = " ... ";
					System.out.println("SEL 3");
					
				}	if(x >= xPosRect4 && x <= xPosRect4+100 && y >= 315 && y <=415) {
					showColor1Selected = false;
					showColor2Selected = false;
					showColor3Selected = false;
					showColor4Selected = true;
					String showColor4 = " ... ";
					System.out.println("SEL 4");
				}
				//Renderer renderer = new Renderer();
				
				
				
			}
			
			@Override
			public void keyTyped(KeyEvent e) {
//				//boolean from mouseclicked
//				if(box1Selected) {
//				if(e.getKeyChar() == '1'|{
//						char showColor1Char = e.getKeyChar();
////						renderer.repaint();
//						drawThis = drawThis + appendThis;}
//				} 
			}

//		
//		if(codeToGuess.length() != 4) { 
//			
//			if(codeToGuess.equals("h")) { 
//				explainGame();
//			} else
//				System.out.println("CODE MUST BE 4 NUMBERS");
//				startUp();
//		}
//		else {
//		System.out.println("code to guess is:  "+ codeToGuess);
//		System.out.println("Hit S to start game with this code");
//		System.out.println("Hit q to enter other code");
//		System.out.println("Hit h to read how the game works");
//		} 
//		Scanner confirmCodeScanner = new Scanner(System.in);
//		String confirmCode = confirmCodeScanner.nextLine();
//		
//		if(confirmCode.equals("s")) { 
//			char[] codeToGuessArray = codeToGuess.toCharArray();
//			
//			playing.letsgo(codeToGuessArray);
//		}
//		if(confirmCode.equals("q")) { 
//			startUp();
//		}
//		if(confirmCode.equals("h")) { 
//			explainGame();
	



@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
		
}
