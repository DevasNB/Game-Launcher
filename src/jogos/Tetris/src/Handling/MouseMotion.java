package jogos.Tetris.src.Handling;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import jogos.Tetris.src.Main.Controller;
import jogos.Tetris.src.Main.Game;
import jogos.Tetris.src.Main.HighScores;
import jogos.Tetris.src.Main.StartingMenu;
import jogos.Tetris.src.Main.EndScreen;

public class MouseMotion implements MouseMotionListener{

	StartingMenu menu;
	Game game;
	HighScores scores;
	EndScreen endscreen;
	
	public MouseMotion(StartingMenu menu, Game game, HighScores scores, EndScreen endscreen) {
            this.game = game;
            this.menu = menu;
            this.scores = scores;
            this.endscreen = endscreen;
	}
	
	public void mouseDragged(MouseEvent e) {
		
	}

	public void mouseMoved(MouseEvent e) {
            if(Controller.state == Controller.STATE.GAME) {
                game.mousePoint.x = e.getX();
		game.mousePoint.y = e.getY();
            }
            
            if(Controller.state == Controller.STATE.MENU) {
                menu.mousePoint.x = e.getX();
                menu.mousePoint.y = e.getY();
		}
		
            if(Controller.state == Controller.STATE.SCORES) {
                scores.mousePoint.x = e.getX();
                scores.mousePoint.y = e.getY();
            }
		
            if(Controller.state == Controller.STATE.ENDSCREEN) {
		endscreen.mousePoint.x = e.getX();
                endscreen.mousePoint.y = e.getY();
            }
	}
}
