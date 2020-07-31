
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Introductie extends Window implements KeyListener, MouseListener{


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public static void introPart(Graphics g) { 

		g.setFont(new Font("Monospace", Font.PLAIN, 20));
			int xIntroText = 600;
			g.drawString("WELKOM BIJ MASTERMIND", xIntroText, 150);
			g.drawString("NEED HELP? Hit 'H' to read how the game works", xIntroText, 175);
			g.drawString("Speler 1 mag een code invoeren...", xIntroText, 215);
			
			// drawing boxesForEnterCodeToGuess:
			g.drawRect(xIntroText,	 350, 50, 50);
			g.drawRect(xIntroText+ 20, 350, 50, 50);
			g.drawRect(xIntroText+ 40, 350, 50, 50);
			g.drawRect(xIntroText+ 60, 350, 50, 50);
			
			g.setFont(new Font("Monospace", Font.PLAIN, 100));
			String showColor1 = " ? ";
			String showColor2 = " ? ";
			String showColor3 = " ? ";
			String showColor4 = " ? ";
			
			g.drawString(showColor1 + showColor2 + showColor3 + showColor4, xIntroText, 400);

} 
			@Override
			public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
	
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
