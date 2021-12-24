package jogos.SnakeGame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{
    
    static final int SCREEN_WIDTH = 600; 
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25; //Tamanho das unidades - isto liga a Grid
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R'; //Right = direita, para onde a snake vai
    boolean running = false;
    static boolean gameOn = false; 
    Timer timer;
    Random random;
    
    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener((KeyListener) new MyKeyAdapter());
        startGame();
    }
    
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
        
    }
    
    public void draw(Graphics g) {
        
        if(running) {
            //Grid, Tabela para ver uma divisão do jogo na criação de pontos para maças e para a snake
            for(int i=0; i<SCREEN_HEIGHT/UNIT_SIZE; i++) {
                g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
            }
            //Maça
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
            
            //bordas
            g.setColor(Color.blue);
            g.fillRect(0, 0, 3, 600);
            g.fillRect(0, 0, 600, 3);
            g.fillRect(597, 0, 3, 600);
            g.fillRect(0, 597, 600, 3);

            //Snake
            for(int i = 0; i<bodyParts; i++) {
                if(i == 0) {
                    g.setColor(Color.green);
                }
                else {
                    g.setColor(new Color(45, 100, 0));
                }
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }
        //Texto de Score
        g.setColor(Color.orange);
        g.setFont(new Font("Berlin Sans FB", Font.BOLD, 30));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
        }
        else {
            gameOver(g);
        }
    }
    
    public void newApple() {
        //appleX - coordenada X
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE; 
        //appleY - coordenada Y
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE; 
    }
    
    public void move() {
        for(int i = bodyParts; i>0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];   
        }
        
        //Mudança de direção
        switch(direction) {
            //U: UP - Para cima
            case 'U': 
                y[0] = y[0] - UNIT_SIZE;
                break;
            
            //D: DOWN - Para baixo
            case 'D': 
                y[0] = y[0] + UNIT_SIZE;
                break;
            
            //L: Left - Para a esquerda   
            case 'L': 
                x[0] = x[0] - UNIT_SIZE;
                break;
                
            //R: RIGHT - Para a direita   
            case 'R': 
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }
    
    public void checkApple() {
        if((x[0] == appleX) && (y[0] == appleY))  {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }
    
    public void checkCollisions() {
        //Verifica se tem colisões com o corpo
        for(int i = bodyParts; i>0; i--) {
            if((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }
        
        //Verifica se tocou na borda esquerda
        if(x[0] < 0) {
            running = false;
        }
        
        //Verifica se tocou na borda direita
        if(x[0] > SCREEN_WIDTH) {
            running = false;
        }
        
        //Verifica se tocou na borda de cima
        if(y[0] < 0) {
            running = false;
        }
        
        //Verifica se tocou na borda de baixo
        if(y[0] > SCREEN_HEIGHT) {
            running = false;
        }
        
        if(!running) {
            //timer.stop();
        }
        
    }
    
    public void gameOver(Graphics g) {
        //Texto de Score
        g.setColor(Color.orange);
        g.setFont(new Font("Berlin Sans FB", Font.BOLD, 30));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
        
        //Texto de GameOver
        g.setColor(Color.red);
        g.setFont(new Font("Berlin Sans FB", Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);
        
        //Texto Reniciar
        g.setColor(Color.white);
        g.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
        FontMetrics metrics3 = getFontMetrics(g.getFont());
        g.drawString("Clique ENTER para reniciar", (SCREEN_WIDTH - metrics3.stringWidth("Clique ENTER para reniciar"))/2, SCREEN_HEIGHT/2+35);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Se o jogo está andar
        if(running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                //Para a esquerda
                case KeyEvent.VK_LEFT:
                    if(direction != 'R') {
                        direction = 'L';
                    }
                    break;
                //Para a direita
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L') {
                        direction = 'R';
                    }
                    break;
                //Para a cima
                case KeyEvent.VK_UP:
                    if(direction != 'D') {
                        direction = 'U';
                    }
                    break;
                //Para a baixo
                case KeyEvent.VK_DOWN:
                    if(direction != 'U') {
                        direction = 'D';
                    }
                    break;
                    
                //Reniciar
                case KeyEvent.VK_ENTER:
                    if (running) {
                        return;
                    }
                    x[0] = 0;
                    y[0] = 0;
                    direction = 'R';
                    running = true;
                    applesEaten = 0;
                    bodyParts = 6;
                    repaint();
                    break;
            }
        }
    }   
}
