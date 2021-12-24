package jogos.Tetris.src.Main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import jogos.Tetris.src.Handling.KeyHandler;
import jogos.Tetris.src.Handling.MouseHandler;
import jogos.Tetris.src.Handling.MouseMotion;

public class Controller extends JPanel implements Runnable {
	
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;

	private BufferedImage image;
	private Graphics2D g;
	static JFrame window = new JFrame();
	private boolean running = true;
	private Thread thread;
	
	private static Game game;
	private static StartingMenu menu;
	private static HighScores highscores;
	private static EndScreen endscreen;
	
	public static int recentScore = 0;
	
        
	Font helveticaLarge = new Font("Arial", Font.PLAIN, 20);
	
	public enum STATE{
            GAME,
            MENU,
            SCORES,
            ENDSCREEN
	}
	public static STATE state = STATE.MENU;
	
	public Controller() {
            super();
            setPreferredSize(new Dimension(WIDTH, HEIGHT));
            setFocusable(true);
            requestFocus(true);
	}

	public void addNotify() {
            super.addNotify();
            if (thread == null) {
                thread = new Thread(this);
		thread.start();
            }
	}
	
	private void init() {
            image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
            g = (Graphics2D) image.getGraphics();
            menu = new StartingMenu();
            game = new Game();
            highscores = new HighScores();
            endscreen = new EndScreen();
            Scoring.init();
            menu.init();
            this.addMouseListener(new MouseHandler(menu, game, highscores, endscreen));
            this.addMouseMotionListener(new MouseMotion(menu, game, highscores, endscreen));
            this.addKeyListener(new KeyHandler(game));
            g.setFont(helveticaLarge);
	}
	
	public void run() {
            init();
            while (running) {
		tick();
                render();
                try {
                    Thread.sleep(10);
                } catch (Exception e) {}
            }
	}

	public void tick() {
            if(state == STATE.GAME) {
                game.tick();
            }
	}
	public void render() {
            if(state == STATE.GAME) {
                game.render(g);
            }
            if(state == STATE.MENU) {
                menu.render(g);
            }
            if(state == STATE.SCORES) {
                highscores.render(g);
            }
            if(state == STATE.ENDSCREEN) {
                endscreen.render(g);
            }
            
            Graphics g2 = getGraphics();
            g2.drawImage(image, 0, 0, null);
            g2.dispose();
	}
	public static void switchClasses(STATE gamestate) {
            state = gamestate;
            if(state == STATE.GAME) {
                game.start();
            }
            if(state == STATE.SCORES) {
                highscores.init();
            }
            if(state == STATE.ENDSCREEN) {
                endscreen.init();
            }
            if(state == STATE.MENU) {
                menu.init();
            }
	}
}