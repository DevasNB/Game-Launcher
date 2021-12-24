package jogos.SnakeGame;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SnakeGame extends JFrame{
    
    public SnakeGame(){
        
        this.add(new GamePanel());
        this.setTitle("Snake Game");
        URL iconURL = getClass().getResource("/img/icons/mini-snakegame.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
