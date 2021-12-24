package jogos.Tetris.src.Handling;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jogos.Tetris.src.Main.Controller;
import jogos.Tetris.src.Main.Game;

public class KeyHandler implements KeyListener {
	Game game;

	public KeyHandler(Game game) {
            this.game = game;
	}

	public void keyPressed(KeyEvent e) {
            if(Controller.state == Controller.STATE.GAME) {
		
                // UP
        	if (e.getKeyCode() == 38 || e.getKeyCode() == 87) {
                    if(!game.hasLost) {
                        game.rotatePiece();
                    }
		}
		
                // Right
		if (e.getKeyCode() == 39 || e.getKeyCode() == 68) {
                    if(!game.hasLost) {
			game.moveRight();
                    }
		}
		
                // Left
		if (e.getKeyCode() == 37 || e.getKeyCode() == 65) {
                    if(!game.hasLost) {
                        game.moveLeft();
                    }
                }
			
                // Down
		if (e.getKeyCode() == 40 || e.getKeyCode() == 83) {
                    if(!game.hasLost) {
                        game.updateBlockPosition(true, true);
                    }
                }
            }
        }

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
}
