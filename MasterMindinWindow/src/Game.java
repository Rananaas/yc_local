

import java.awt.Graphics;

import java.util.Scanner;

import javax.swing.JFrame;



public class Game{

	public static int WIDTH = 1200;
	public static int HEIGHT = 800;
	
	// voor IntroductieClass: 
	public boolean showColor1Selected = true;
	public boolean showColor2Selected = false;
	public boolean showColor3Selected = false;
	public boolean showColor4Selected = false;
	public boolean redSelected = false;
	public boolean greenSelected = false;
	public boolean blueSelected = false;
	public boolean yellowSelected = false;
	public boolean pinkSelected = false;
	public boolean orangeSelected = false;
	
	
	//public Window window;
	public Renderer renderer;
	public static Game game;
	Introductie introductie = new Introductie();
	Window window = new Window();
	
	public static void main(String[] args)
	//base
	{ 
		game = new Game(null);

	}
	
	
	public Game(JFrame jframe) {


	
		jframe = new JFrame();
		renderer = new Renderer();
		jframe.add(renderer);
		jframe.setTitle("MasterMind");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.addMouseListener(new Introductie());
		jframe.addKeyListener(new Introductie());
		jframe.setVisible(true);

		//startUp(); // kan later weg al geimplementeerd is ipv console.
		
	}
	
	public static void startUp() { 
		
		
		System.out.println("WELKOM BIJ MASTERMIND");
		System.out.println("NEED HELP? Hit h to read how the game works");
		System.out.println("/////////////////////////////////////////////");
		System.out.println("Speler 1 mag een code invoeren:");
		Scanner codeToGuessScanner = new Scanner(System.in);
		String codeToGuess = codeToGuessScanner.nextLine();
		
		if(codeToGuess.length() != 4) { 
			
			if(codeToGuess.equals("h")) { 
				explainGame();
			} else
				System.out.println("CODE MUST BE 4 NUMBERS");
				startUp();
		}
		else {
		System.out.println("code to guess is:  "+ codeToGuess);
		System.out.println("Hit S to start game with this code");
		System.out.println("Hit q to enter other code");
		System.out.println("Hit h to read how the game works");
		} 
		Scanner confirmCodeScanner = new Scanner(System.in);
		String confirmCode = confirmCodeScanner.nextLine();
		
		if(confirmCode.equals("s")) { 
			char[] codeToGuessArray = codeToGuess.toCharArray();
			
			playing.letsgo(codeToGuessArray);
		}
		if(confirmCode.equals("q")) { 
			startUp();
		}
		if(confirmCode.equals("h")) { 
			explainGame();
		}
		
	}

	private static void explainGame() {
		System.out.println("///////////////GAME MANUAL: /////////////////////");
		System.out.println("Guess the secret code of 4 numbers");
		System.out.println("You have 10 attempts to do so");
		System.out.println("If an number is part of the code AND in the right place, a 'B' will be returned");
		System.out.println("If an number is part of the code BUT NOT in the right place, a 'W' will be returned");
		System.out.println("WATCH OUT! the order of how the B's and W's will be returned doesnt necessarily means"
				+ "this is the correct order ");
		System.out.println("//////////GOOD LUCK!////////////");
		startUp();
		
		
	}
	public void repaint(Graphics g) {
		System.out.println("he");
		//Window window = new Window();	
		window.paint(g, renderer);
//		Introductie introductie = new Introductie();
		introductie.introPart(g);
	//	renderer.repaint();
		
	}
//	public void repaintIntro(Graphics g) { 
//		System.out.println("aasdsda");
//		
//	}



}
