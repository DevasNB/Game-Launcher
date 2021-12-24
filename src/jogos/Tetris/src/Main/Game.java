package jogos.Tetris.src.Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Game{

	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;

	private Thread tickThread;
	public boolean running;
	private Player player;
	public Point mousePoint;
	
	private int cellSize = 25;
	public static int gridWidth = 10;
	public static int gridHeight = 16;
	private int[][] gamePos = new int[10][16];
	public boolean hasCreated = false;
	public Piece controlPiece;
	private Piece nextPiece;
	private ImageLoader square;
	private int speed = 1100;
	public boolean hasLost = false;
	public boolean showGuide = false;
	
	public Rectangle[] buttons = {new Rectangle(WIDTH/3+135, 165, 200, 50), 
						new Rectangle(WIDTH/3+135, 220, 200, 50),
						new Rectangle(WIDTH/3+135, 275, 200, 50)};
	
	public Game() {
		init();
	
	}
	public void start() {
		clearGame();
		tickThread = new Thread(new Clock());
		tickThread.start();
		running = true;
	}
	private void init() {
		player = new Player(0, 0);
		square = new ImageLoader(ImageLoader.squarePath);
		for(int i = 0; i < gamePos.length; i++) {
			for(int j = 0; j < gamePos[0].length; j++) {
				gamePos[i][j] = 0;
			}
		}
		nextPiece = new Piece(4, 0, Shapes.randomBlock());
		mousePoint = new Point(0, 0);
	}
	
	public void tick() {
		if (!hasCreated) {
			checkRowCompletion();
			checkLoss();
			if(!hasLost) {
				controlPiece = nextPiece;
				nextPiece = new Piece(4, 0, Shapes.randomBlock());
				updateCurrentPiece();
				hasCreated = true;
			}
		}else {
			if(!hasLost) {
				updateBlockPosition(false, false);
			}
		}
	}

	public void render(Graphics g) {
	g.setColor(Color.black);
	g.fillRect(0, 0, WIDTH, HEIGHT);
	g.setColor(Color.black);
	g.fillRect(50, 20, 250, HEIGHT-100);
	g.setColor(Color.white);
	//draw orange background grid
	for(int i = 0; i < gridWidth; i++) { //grid width 
		for(int j = 0; j < gridHeight; j++) { //height
			g.drawRect(i*cellSize + 50, j*cellSize+20, cellSize, cellSize);
		}
	}
	/**Next Item Drawing*/
	//Draw background and text

        g.setColor(Color.white);
	g.drawString("Forma Seguinte", (50+gridWidth*cellSize)+80, 35);
        
        g.setColor(Color.black);
	g.fillRect((50+gridWidth*cellSize)+100, 45, 100, 100);
	
        //g.setColor(Color.white);
	//Draw grid
	for(int i = 0; i < 4; i++) {
		for(int j = 0; j < 4; j++) {
			g.drawRect((i*cellSize) + (50+gridWidth*cellSize)+100, j*cellSize + 45, cellSize, cellSize);
		}
	}
	//Draw next block
	
	for(int i = 0; i < nextPiece.width(); i++) {
		for(int j = 0; j < nextPiece.height(); j++) {
			if(nextPiece.getShape()[i][j] != 0) {
				g.drawImage(square.getSubImage(nextPiece.getShape()[i][j]), (i*cellSize) + (50+gridWidth*cellSize)+100+cellSize, j*cellSize + 45, cellSize, cellSize, null);
				g.drawRoundRect((i*cellSize) + (50+gridWidth*cellSize)+100+cellSize, j*cellSize + 45, cellSize, cellSize, 1, 1);
			}
		}
	}
	
	g.setColor(new Color(100, 100, 100));
	g.fillRoundRect(Controller.WIDTH/3+110, 150, 250, 275, 25, 25);
	
        /*Desenhar os botões*/
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
	
        /*Desenhar o score*/
	g.setColor(Color.white);
	g.drawString("Novo Jogo", WIDTH/3+150, 200);
	g.drawString("Mostra Guias", WIDTH/3+150, 255);
	g.drawString("Menu Principal", WIDTH/3+150, 310);
	g.drawString("Nivel: " + player.getLevel(), WIDTH/3+150, 365);
	g.drawString("Pontuação: " + player.getScore(), WIDTH/3+150, 395);
	g.setColor(new Color(255, 128, 0));
	
                //desenhar blocos
		for(int i = 0; i < gridWidth; i++) { //grelha
                    for(int j = 0; j < gridHeight; j++) { //width
                        g.drawImage(square.getSubImage(gamePos[i][j]), i*cellSize + 50, j*cellSize+20, cellSize, cellSize, null);
                            if(gamePos[i][j] > 0) {
				g.setColor(Color.black);
				g.drawRoundRect(i*cellSize + 50, j*cellSize+20, cellSize, cellSize, 1, 1);
                            }
                    }
		}
                
		//desenhar as guias
		g.setColor(Color.green);
		if(showGuide) {
                    for(int i = controlPiece.getY()+controlPiece.getShape()[0].length-1; i < gamePos[0].length; i++) {
			for(int j = controlPiece.getX(); j < controlPiece.getX()+controlPiece.getShape().length; j++) {
                            if(gamePos[j][i] == 0) {
				g.drawRoundRect(j*cellSize + 50, i*cellSize+20, cellSize, cellSize, 1, 1);
                            }
                            else {
                                break;
                            }
			}
                    }
		}
	}

	public void updateBlockPosition(boolean update, boolean extraPoint) {
		boolean canUpdate = true;
		if(controlPiece != null) {
			if(controlPiece.getY()+ controlPiece.height() < gridHeight) { //if its not at bottom level
				for(int i = 0; i < controlPiece.width(); i++) {
					if(canUpdate) {
						if(controlPiece.getShape()[i][controlPiece.height()-1] > 0) {
							if(gamePos[controlPiece.getX() + i][controlPiece.getY()+controlPiece.height()]  > 0) {
								canUpdate = false;
								hasCreated = false;
							}
						}else if(controlPiece.getShape()[i][controlPiece.height()-2] > 0) {
							if(gamePos[controlPiece.getX() + i][controlPiece.getY()+controlPiece.height()-1]  > 0) {
								canUpdate = false;
								hasCreated = false;							
							}
						}else if(controlPiece.getShape()[i][controlPiece.height()-3] > 0) {//height - 3
							if(gamePos[controlPiece.getX() + i][controlPiece.getY()+controlPiece.height()-2]  > 0) {
								canUpdate = false;
								hasCreated = false;
							}
						}else if(controlPiece.getShape()[i][controlPiece.height()-4] > 0) {//height - 3
							if(gamePos[controlPiece.getX() + i][controlPiece.getY()+controlPiece.height()-3]  > 0) {
								canUpdate = false;
								hasCreated = false;
							}
						}else {
							System.out.println("Aparentemente esta forma (" + controlPiece +") tem uma linha inteira de 0 vazio. Erro em updateBlockPos");
						}
						
//						for(int j = 1; j <= controlPiece.height(); j++) {
//							if(controlPiece.getShape()[i][controlPiece.height()-j] > 0) {
//								if(gamePos[controlPiece.getX() + i][controlPiece.getY()+controlPiece.height()-j+1] > 0) {
//									canUpdate = false;
//									hasCreated = false;
//									break;
//								}
//							}
//						}						
					}
				}
				if(canUpdate) {
					removeCurrentPiece();
					if(update) {
						controlPiece.updateY();
					}
					updateCurrentPiece();
					if(extraPoint) {
						player.addScore();
					}
				}
			}else {
				hasCreated = false;
			}
		}
	}
	public void moveLeft() {
		boolean canMove = true;
		if(controlPiece.getX() > 0) {
			for(int i = 0; i < controlPiece.height(); i++) {
				//if one is not directly next to the left block
				if(gamePos[controlPiece.getX()-1][controlPiece.getY()+i] > 0 && controlPiece.getShape()[0][i] > 0) {
					canMove = false;
				}
			}
			if(canMove) {
				removeCurrentPiece();
				controlPiece.setX(controlPiece.getX()-1);
				updateCurrentPiece();
			}
		}
	}
	public void moveRight() {
		boolean canMove = true;
		if(controlPiece.getX()+controlPiece.width() < gridWidth) {
			for(int i = 0; i < controlPiece.height(); i++) {
				//if one is not directly next to the left block
				if(gamePos[controlPiece.getX()+controlPiece.width()][controlPiece.getY()+i] > 0 && controlPiece.getShape()[controlPiece.width()-1][i] > 0) {
					canMove = false;
				}
			}
			if(canMove) {
				removeCurrentPiece();
				controlPiece.setX(controlPiece.getX()+1);
				updateCurrentPiece();
			}
		}
	}
	public void removeCurrentPiece() {
		if(controlPiece.getY() >= 0) {
			for(int i = 0; i < controlPiece.height(); i++) {
				for(int j = 0; j < controlPiece.width(); j++) {
					if(controlPiece.getShape()[j][i] != 0){
						gamePos[controlPiece.getX()+j][controlPiece.getY()+i] = 0;
					}
				}
			}
		}
	}
	
	public void checkRowCompletion() {
		int rowCompletion = 0;
		int count = 0;
		for(int i = 0; i < gridHeight; i++) {
			count = 0;
			for(int j = 0; j < gridWidth; j++) {
				if(gamePos[j][i] > 0) {
					count++;
				}
			}
			if(count == gridWidth) {//completed one row
				for(int j = 0; j < gridWidth; j++) {
					gamePos[j][i] = 0;
				}
				player.clearedLine();
				moveDownRows(i);
				rowCompletion++;
			}
		}
		if(rowCompletion > 0) {
			player.addScore(rowCompletion);
		}
	}
	
	public void checkLoss() {
		if(gamePos[4][0] > 0 || gamePos[5][0] > 0) {
			hasLost = true;
			running = false;
			Controller.recentScore = player.getScore();
			Controller.switchClasses(Controller.STATE.ENDSCREEN);
		}
	}
	
	public void moveDownRows(int height) {
		for(int i = height; i > 1; i--) { //start from the bottom and work way up
			for(int j = 0; j < gridWidth; j++) {
				gamePos[j][i] = gamePos[j][i-1];//get the previous colums numbers and replace them.
			}
		}
	}
	public void updateCurrentPiece() {
		for(int i = 0; i < controlPiece.height(); i++) {//loop through height
			for(int j = 0; j < controlPiece.width(); j++) { //loop through width
				if(controlPiece.getShape()[j][i] != 0) { //
					//TODO: Error here!
	//Exception in thread "Thread-8" Exception in thread "Thread-6" java.lang.ArrayIndexOutOfBoundsException: 16
					gamePos[controlPiece.getX()+j][controlPiece.getY()+i] = controlPiece.getShape()[j][i];
				}
			}
		}
	}
	public void rotatePiece() {
		removeCurrentPiece();
		controlPiece.rotateSelf(gamePos);
		updateCurrentPiece();
	}
	public void clearGame() {
		player = new Player(0, 0);
		hasLost = false;
		hasCreated = false;
		nextPiece = new Piece(4, 0, Shapes.randomBlock());
		for(int i = 0; i < gridHeight; i++) {
			for(int j = 0; j < gridWidth; j++) {
				gamePos[j][i] = 0;
			}
		}
}
	public void backToMenu() {
		running = false;
		Controller.switchClasses(Controller.STATE.MENU);
	}
	private class Clock implements Runnable { 
		public void run() {
			while(running == true) {
					try {
						Thread.sleep(speed-(player.getLevel()*100));
						
					}
					catch (InterruptedException e) {
						break;
					}
					if(!hasLost) {
						updateBlockPosition(true, false);
					}
					if (running == false) break;
			}
		}
	}
}