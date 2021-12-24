package jogos.Tetris.src.Main;

import jogos.Tetris.src.Main.Controller;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartingMenu extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;

	Font normalFont = new Font("Helvetica", Font.BOLD, 22);
	Font smallFont = new Font("Helvetica", Font.PLAIN, 17);
	public Point mousePoint;
	private ImageLoader square;
	public Thread thread;
	Random random;
	static JFrame window = new JFrame();

	private int spawnCount = 0;
	public boolean running = false;
	private int paddingWidth = 20;
	public Rectangle[] buttons = {new Rectangle(WIDTH/2-100, 210, 200, 50), 
					new Rectangle(WIDTH/2-100, 210+75, 200, 50),
	};
        
	private Piece[] pieces;

	private int speed = 350;
	
	public StartingMenu() {
		mousePoint = new Point(0, 0);
		square = new ImageLoader(ImageLoader.squarePath);
		thread = new Thread();
	}
	
	public void init() {
		random = new Random();
		running = true;
		pieces = new Piece[15];
		thread = new Thread(new Clock());
		thread.start();
		
	}
	public void tick() {
		
		int spawnChance;
		spawnChance = random.nextInt(3);
		if(spawnChance == 0) {
			if(spawnCount < pieces.length) {
			pieces[spawnCount] = new Piece(random.nextInt(21)*25, -50, Shapes.randomBlock());
			spawnCount++;
			}else {
				spawnCount = 0;
				pieces[spawnCount] = new Piece(random.nextInt(21)*25, -50, Shapes.randomBlock());
			}
		}
		for(int i = 0; i < pieces.length; i++) {
			if(pieces[i] != null) {
			pieces[i].setY(pieces[i].getY()+25);
			}
		}
	}
	public void render(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, WIDTH, HEIGHT);
	//render background
	int xPos;
	int yPos;
	for(int i = 0; i < pieces.length; i++) {
            if(pieces[i] != null) {
                for(int j = 0; j < pieces[i].getShape().length; j++) {
                    for(int k = 0; k < pieces[i].getShape()[j].length; k++) {
                        if(pieces[i].getShape()[j][k] != 0) {
                            xPos = pieces[i].getX()+k*25;
                            yPos = pieces[i].getY()+j*25;
                            g.drawImage(square.getSubImage(Shapes.getColor(pieces[i].getShape())), xPos, yPos, 25, 25, null);
			}	
                    }
		}
            }
	}
	g.setColor(new Color(100, 100, 100, 180));
	g.fillRoundRect(100, 100, Controller.WIDTH/3*2, Controller.HEIGHT/3*2, 25, 25);
	
	/*Draw buttons*/
	g.setColor(new Color(255, 128, 0)); //background color
	for(int i = 0; i < buttons.length; i++) {
            if(buttons[i].contains(mousePoint)) {
		g.fillRoundRect(buttons[i].x, buttons[i].y, buttons[i].width, buttons[i].height, 25, 25);
            }
	}
	g.setColor(new Color(255, 128, 0)); //border
	for(int i = 0; i < buttons.length; i++) {
            g.drawRoundRect(buttons[i].x, buttons[i].y, buttons[i].width, buttons[i].height, 25, 25);		
	}
	g.drawImage(new ImageLoader(ImageLoader.tetrisPath).getImage(), WIDTH/2-80, 60, 160, 105, null);
	g.setColor(Color.white);
	g.setFont(normalFont);
	g.drawString("Novo Jogo", centerText(g, "Novo Jogo"), buttons[0].y+paddingWidth+(paddingWidth/2));
	g.drawString("Pontuações", centerText(g, "Pontuações"), buttons[1].y+paddingWidth+(paddingWidth/2));
	
	/*End Drawing Buttons*/
	}
	public int centerText(Graphics g, String text) {
            return WIDTH/2-g.getFontMetrics().stringWidth(text)/2;
	}
	

	public void highScores() {
            Controller.switchClasses(Controller.STATE.SCORES);
	}

	public void playGame() {
            Controller.switchClasses(Controller.STATE.GAME);
	}
	private class Clock implements Runnable { 
            public void run() {
                    while(running == true) {
                        tick();
                            try {
				Thread.sleep(speed);
                            }
                            catch (InterruptedException e) {
				break;
                            }
                            if (running == false) break;
			}
		}
	}
}