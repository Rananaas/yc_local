
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class Introductie extends Window implements KeyListener, MouseListener{



	public static int xPosRect1 = 610;
	public static int xPosRect2 = 720;
	public static int xPosRect3 = 830;
	public static int xPosRect4 = 940;

	Color[] codeToGuessArray = new Color[4];
	
		
	public void introPart(Graphics g) { 

	
			g.setFont(new Font("Monospace", Font.PLAIN, 20));
			int xIntroText = 600;
			g.drawString("WELKOM BIJ MASTERMIND", xIntroText+10, 150);
			g.drawString("NEED HELP? Hit 'H' to read how the game works", xIntroText+10, 175);
			g.drawString("Speler 1 mag een code invoeren...", xIntroText+10,275);
			g.drawString("Klik op een vakje en typ het cijfer van de gewenste kleur in..", xIntroText+10,300);
			g.drawString("ENTER om code te bevestigen", xIntroText+10,450);
			
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

			codePicker(g);

} 
	
	public Color fillSelected() {
		Color color = Color.GRAY;
		if(Game.game.redSelected == true) { 
			color = Color.RED;
		} 
			else if(Game.game.greenSelected == true) { 
				color = Color.GREEN;
			}
			else if(Game.game.blueSelected == true) { 
				color = Color.BLUE;
			}
			else if(Game.game.yellowSelected == true) { 
				color = Color.YELLOW;
			}
			else if(Game.game.pinkSelected == true) { 
				color = Color.PINK;
			}
			else if(Game.game.orangeSelected == true) { 
				color = Color.ORANGE;
			}
		
		return color;
		
	}
	public void codePicker(Graphics g) { 
		
		g.setFont(new Font("Monospace", Font.PLAIN, 45));

		
		String showColor1 = " ? ";
		String showColor2 = " ? ";
		String showColor3 = " ? ";
		String showColor4 = " ? ";

		
		Color color = fillSelected();
		if(Game.game.showColor1Selected == true) { 
			g.setColor(color);
			codeToGuessArray[0] = color;
			g.fillRect(xPosRect1, 315, 100, 100);
			g.setColor(Color.WHITE);
			g.drawRect(xPosRect1,315, 100, 100);
			g.setColor(Color.BLACK);
		} else 
			if(Game.game.showColor2Selected == true) { 
			g.setColor(color);
			codeToGuessArray[1] = color;
			g.fillRect(xPosRect2, 315, 100, 100);
			g.setColor(Color.WHITE);
			g.drawRect(xPosRect2,315, 100, 100);
			g.setColor(Color.black);
		} else 
			if(Game.game.showColor3Selected == true) { 
			g.setColor(color);
			codeToGuessArray[2] = color;
			g.fillRect(xPosRect3, 315, 100, 100);
			g.setColor(Color.WHITE);
			g.drawRect(xPosRect3,315, 100, 100);
			g.setColor(Color.black);
		} else 
			if(Game.game.showColor4Selected == true) { 
			g.setColor(color);
			codeToGuessArray[3] = color;
			g.fillRect(xPosRect4, 315, 100, 100);
			g.setColor(Color.WHITE);
			g.drawRect(xPosRect4,315, 100, 100);
			g.setColor(Color.black);
		}
		
		System.out.println("codeToGuessArray: " + Arrays.toString(codeToGuessArray));

		
		
		g.drawString(showColor1, 635, 400);
		g.drawString(showColor2, 745, 400);
		g.drawString(showColor3, 855, 400);
		g.drawString(showColor4, 970, 400);
		
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
					Game.game.showColor1Selected = true;
					Game.game.showColor2Selected = false;
					Game.game.showColor3Selected = false;
					Game.game.showColor4Selected = false;
					System.out.println("SEL 1");
					
					Game.game.renderer.repaint();

				}
				if(x >= xPosRect2 && x <= xPosRect2+100 && y >= 315 && y <=415) {
					Game.game.showColor1Selected = false;
					Game.game.showColor2Selected = true;
					Game.game.showColor3Selected = false;
					Game.game.showColor4Selected = false;
					System.out.println("SEL 2");

					Game.game.renderer.repaint();
					
				}
				if(x >= xPosRect3 && x <= xPosRect3+100 && y >= 315 && y <=415) {
					Game.game.showColor1Selected = false;
					Game.game.showColor2Selected = false;
					Game.game.showColor3Selected = true;
					Game.game.showColor4Selected = false;
					System.out.println("SEL 3");

					Game.game.renderer.repaint();
					
				}	if(x >= xPosRect4 && x <= xPosRect4+100 && y >= 315 && y <=415) {
					Game.game.showColor1Selected = false;
					Game.game.showColor2Selected = false;
					Game.game.showColor3Selected = false;
					Game.game.showColor4Selected = true;
					System.out.println("SEL 4");

					Game.game.renderer.repaint();
				}

				
				
				
			}
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				if (e.getKeyChar() == '1' || e.getKeyChar() == '2' || e.getKeyChar() == '3' || 
						e.getKeyChar() == '4' || e.getKeyChar() == '5' || e.getKeyChar() == '6' ) { 
					Game.game.keyTypedNow = true;
				}

					
				if(e.getKeyChar() == '1'){
					System.out.println("1");
					Game.game.redSelected = true;
					Game.game.greenSelected = false;
					Game.game.blueSelected = false;
					Game.game.yellowSelected = false;
					Game.game.pinkSelected = false;
					Game.game.orangeSelected = false;
					}
				
					else if(e.getKeyChar() == '2'){
						System.out.println("2");
						Game.game.redSelected = false;
						Game.game.greenSelected = true;
						Game.game.blueSelected = false;
						Game.game.yellowSelected = false;
						Game.game.pinkSelected = false;
						Game.game.orangeSelected = false;
						}
					else if(e.getKeyChar() == '3'){
						System.out.println("3");
						Game.game.redSelected = false;
						Game.game.greenSelected = false;
						Game.game.blueSelected = true;
						Game.game.yellowSelected = false;
						Game.game.pinkSelected = false;
						Game.game.orangeSelected = false;
						}
					else if(e.getKeyChar() == '4'){
						System.out.println("4");
						Game.game.redSelected = false;
						Game.game.greenSelected = false;
						Game.game.blueSelected = false;
						Game.game.yellowSelected = true;
						Game.game.pinkSelected = false;
						Game.game.orangeSelected = false;
						}
					else if(e.getKeyChar() == '5'){
						System.out.println("5");
						Game.game.redSelected = false;
						Game.game.greenSelected = false;
						Game.game.blueSelected = false;
						Game.game.yellowSelected = false;
						Game.game.pinkSelected = true;
						Game.game.orangeSelected = false;
						}
					else if(e.getKeyChar() == '6'){
						System.out.println("6");
						Game.game.redSelected = false;
						Game.game.greenSelected = false;
						Game.game.blueSelected = false;
						Game.game.yellowSelected = false;
						Game.game.pinkSelected = false;
						Game.game.orangeSelected = true;
						}

				
				Game.game.renderer.repaint();
				} 



@Override
public void keyPressed(KeyEvent e) {
	
	if(e.getKeyCode() == KeyEvent.VK_ENTER){
	 System.out.println("CONFIRMING CODE! LETS GO!");
	 Game.game.codeConfirmed = true;
		
	}	
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
