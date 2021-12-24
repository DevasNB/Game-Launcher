package jogos.BrickBreaker;

import jogos.BrickBreaker.Gameplay;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
* PAP
* João Devesa
*/
public class BrickBreaker extends JFrame{
    
        public BrickBreaker() {
        
        JFrame obj = new JFrame();  //Objeto
        Gameplay gameplay = new Gameplay();
        obj.setBounds(10, 10, 700, 600);
        URL iconURL = getClass().getResource("/img/icons/mini-brickbreaker2.png");
        ImageIcon icon = new ImageIcon(iconURL);
        obj.setIconImage(icon.getImage());
        obj.setTitle("BrickBreaker");
        obj.setResizable(false);
        obj.setVisible(true);    
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        obj.add(gameplay);
        }
    }
