package jogos.BrickBreaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    
    private boolean play = false;
    
    private int score = 0;
    private int totalBricks = 21;
    
    private Timer timer;
    private int delay = 8;
    
    private int playerX= 310;
    
    private int ballposX = 350;
    private int ballposY = 450;
    private int ballXdir = (int)Math.ceil(Math.random() * 4);
    private int ballYdir = (int)Math.floor(Math.random() * -4);
    
    private MapGenerator map;
    
    public Gameplay() {
        
        map = new MapGenerator(3, 7);
        
        addKeyListener(this); 
        setFocusable(true);  
        setFocusTraversalKeysEnabled(false);  
        timer = new Timer(delay, this);
        timer.start();
    }
    
    public void paint(Graphics g) {
        
        //fundo
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);
        
        //draw desenho
        map.draw((Graphics2D)g);
        
        //score
        g.setColor(Color.WHITE);
        g.setFont(new Font ("Arial Black", Font.BOLD, 25));
        g.drawString(""+score, 590, 30);
        
        //bordas
        g.setColor(Color.orange);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(682, 0, 3, 592);
        
        //remo
        g.setColor(Color.orange);
        g.fillRect(playerX, 550, 100, 8);
        
        //bola
        g.setColor(Color.white);
        g.fillOval(ballposX, ballposY, 20, 20);
        
        //GG
        if(totalBricks <= 0)
        {
            play = true;
            
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial Black", Font.BOLD, 30));
            g.drawString("VENCEDOR", 245, 350);
            
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Pressiona ENTER para Reiniciar", 190, 400);
            
            score = 0;
            timer.stop();
        }
        
        //GameOver
        if(ballposY > 570)
        {
            play = true;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial Black", Font.BOLD, 30));
            g.drawString("Fim do Jogo", 240, 350);
            
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Pressiona ENTER para Reiniciar", 190, 400);
            
            score = 0;
            timer.stop();
        }
        
        g.dispose();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        timer.start();
        
        if(play)
        {
            if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8)))
            {
                ballYdir = - ballYdir;
            }    
            A:for(int i=0;i<map.map.length; i++)
            {
                for(int j=0;j<map.map[0].length; j++)
                {
                    if(map.map[i][j] > 0)
                    {
                        int brickX = j* map.brickWidth+80;
                        int brickY = i* map.brickHeight+50;
                        int brickWidth = map.brickWidth;
                        int brickHeigth = map.brickHeight;
                        
                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeigth);
                        Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
                        Rectangle brickRect = rect;
                        
                        if(ballRect.intersects(brickRect))
                        {
                            map.setBrickValue(0, i, j);
                            totalBricks--;
                            score += 5;
                            
                            if(ballposX+19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width)
                            {
                                ballXdir = -ballXdir;
                                
                            }
                            else
                            {
                                ballYdir = -ballYdir;
                            }
                            break A;
                        }
                    }
                }
            }
        
            ballposX += ballXdir; 
            ballposY += ballYdir;
            
            if(ballposX < 0)
            {
               ballXdir = - ballXdir;
            }
            if(ballposY < 0)
            {
            ballYdir = -ballYdir;
            }
            if(ballposX > 670)
            {
            ballXdir = - ballXdir;
            }
        }
       repaint();
    }   
    
    @Override
    public void keyTyped(KeyEvent Ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent Ke) {
       
    }

    @Override
    public void keyPressed(KeyEvent Ke) {
        
        if(Ke.getKeyCode() == KeyEvent.VK_RIGHT) {
        if(playerX >= 600) {
            playerX = 600;
        }
        else {
            moveRight();  //metodos
        }
    }
        if(Ke.getKeyCode() == KeyEvent.VK_LEFT) {
        if(playerX < 10) {
            playerX = 10;
        }
        else {
            moveLeft();  //metodos
        }
    }
        if(Ke.getKeyCode() == KeyEvent.VK_ENTER) {
            if(play)
            {
                play = true;
                ballposX = 350;
                ballposY = 450;
                
                int p = (int) (Math.random() * 100);
                ballXdir = p >= 50 ? (int)Math.floor(Math.random() * -4) : (int)Math.ceil(Math.random() * 4); //isto é um if e else! -- ternário -- ? = sim  : = não

                ballYdir = (int) Math.floor(Math.random() * -4);
                
                playerX = 310;
                
                score = 0;
                totalBricks = 21;
                map = new MapGenerator(3, 7);
                
                timer.start();
            }
        }
    }    
    public void moveRight() {
       
        play = true;
       playerX += 20;
    }
    public void moveLeft() {
       
        play = true;
       playerX -= 20;
   }
}
