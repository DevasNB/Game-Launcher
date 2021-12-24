package jogos.Tetris.src.Main;

import java.applet.Applet;
import java.net.URL;
import javax.swing.ImageIcon;

import javax.swing.JFrame;


public class Frame extends Applet{

	private static final long serialVersionUID = 7628012482200969792L;
	
        static JFrame window = new JFrame();
	
        public Frame() {
            
            window.setContentPane(new Controller());
            window.pack();	
            window.setSize(StartingMenu.WIDTH, StartingMenu.HEIGHT);
            window.setResizable(false);
            window.setLocationRelativeTo(null);
            URL iconURL = getClass().getResource("/img/icons/mini-TetrisLogo.png");
            ImageIcon icon = new ImageIcon(iconURL);
            window.setIconImage(icon.getImage());
            window.setTitle("Tetris");
            window.setVisible(true);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        }
}